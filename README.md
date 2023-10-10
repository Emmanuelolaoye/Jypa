University Of Essex 

BSc Computer Science         CE305 Language and Compilers 

![](Aspose.Words.1f2de021-5180-4c54-9a22-ff96154d9bc5.001.png)

A Small Compiler 

**Author  Module Supervisor** Emmanuel Olaoye  Somdip Dey 

1905600 

23 August 2023 

**Introduction** 

The goal of this project is to develop a “small compiler” using Antlr and java. This Compiler should allow a user to type in a new Language created by me which would then be Translated into Python. According to the Assignment Guidelines, the source language should include basic notions like variable declarations, variable assignment statements, expressions, and sequencing of statements. Control flow structures such as conditional statements (including if-then-else), unbounded iteration (while loops), and statement blocks (using "begin", "end", or "{...}") should be part of the source language. 

**ANTLR  ![](Aspose.Words.1f2de021-5180-4c54-9a22-ff96154d9bc5.002.png)**

**ANTLR** (ANother Tool for Language Recognition) is a powerful framework  for generating parsers and lexers used in language processing tasks. It  allows for defining the syntax of a language using a formal grammar  specification. ANTLR then generates code that can parse input written in  that language, making it useful for building compilers, interpreters,  translators, and other language-related tools. The framework automates  the complex process of parsing and lexing, allowing developers to focus on  higher-level tasks like defining language rules and implementing custom  *Figure 1 Antlr Logo ![](Aspose.Words.1f2de021-5180-4c54-9a22-ff96154d9bc5.003.png)*processing logic. 

**The Compiler Implementation** 

**Grammar Rules:**

**Syntax Structure:** The language is structured around a set of grammar rules that define how statements and expressions are organized within the code. 

**Program and Block Structure:** The core structure of the language includes a **program** rule, representing the entire program. A **stat** rule defines a block of statements, allowing for multiple statements separated by newlines (**NEWL\***). 

**Statement Types:** The language supports various statement types, including: 

Variable assignments and operations (**set\_variable**) Conditional statements (**if\_Statement**) 

Looping constructs (**while\_Statement** and **for\_Statement**) Function definitions (**def\_method**) 

Function calls (**method**) 

**Expression Handling:** Expressions are integral to the language and can involve various operations and comparisons. Expressions encompass: 

Unary expressions (**UnaryExpression**) 

Arithmetic operations (**MultiplyExpression**, **DivisionExpression**, **Plus\_Minus**) 

Logical operations (**AndOrExpression**) 

Comparison operations (**ComparisonExpression**) 

Negation (**NegateExpression**) 

Identifiers (**IdExpression**) 

Method calls (**FunctionCallExpression**) 

Constants (**NullExpression**, **BooleanExpression**, **NumberExpression**, **StringExpression**) 

**Non-Terminals:** 

1. **name ID:** Identifier rule for variable or function names. 
1. **ASSIGN\_OPERATOR: (PLUS | MINUS | MULTIPLY | DIVISION | REMAINDER) EQUALS** Assignment operators: +, -, \*, /, %, represented by =. 
1. **MINUSMINUS:** Decrement operator **--.** 
1. **PLUSPLUS:** Increment operator **++**. 
1. **NULL: 'null':** Null value represented by 'null'. 
1. **BOOLEAN: 'True'|'False’;** Boolean values: True or False. 
1. **IF: 'if':** Keyword "if" for conditional statements. 
1. **ELSEIF:**  Keyword "elif" for "else if" statements. 
1. **ELSE:** Keyword "else" for "else" statements. 
1. **WHILE** Keyword "while" for loop statements. 
1. **FOR:** Keyword "for" for loop statements. 
1. **LPAREN:** Left parenthesis symbol **'('**. 
1. **RPAREN:** Right parenthesis symbol **')'**. 
1. **LCURLY:** Left curly brace symbol **'{'**. 
1. **RCURLY:** Right curly brace symbol **'}'**. 
1. **METHOD: 'method';** Keyword "method" for method declaration. 
1. **COMMA: ',' ;** Comma symbol for separation. 
1. **RETURN:** Keyword **"ret"** for return statement. 
1. **TYPE:** data types: int, float, string, bool, char. 
1. ***ID: [a-zA-Z][a-zA-Z0-9\_] ;*\*** Valid identifier names: letters, digits, underscores. 
1. ***NUMBER: (DECIMAL DIGITS+ | DIGITS+ DECIMAL | DIGITS+) DIGITS ([eE][-+]? DIGITS+)? ;*\*:** Numeric values: integers, decimals, scientific notation. 
1. ***STRING: '"' CHARACTER? '"' ;*\*** String values enclosed in double quotes. 
1. **DIGITS: [0-9] ;** Individual digits from 0 to 9. 
1. **WS: [ \t]+ -> skip;** Whitespace characters, skipped by parser. 
1. **NEWL: ('\n' | '\r' | WS)+ ;** Newline characters and associated whitespace, skipped. 
1. **COMMENT: ('//' ~[\r\n]\*) -> skip;** Single-line comments starting with "//", skipped. 
1. **CHARACTER: [a-zA-Z0-9 \!"£$%^&\*()\_+={}[]@~<:?>,;/.-]** Characters used in strings. 

**The Source Code** 

The language defined by the grammar file is **dynamically typed**. In a dynamically typed language, the data types of variables are determined at runtime, rather than being explicitly declared at compile time. Here are some reasons that suggest the language is dynamically typed: 

**Variable Declaration:** The grammar specifies variable declarations without explicit type annotations. Variables are declared using the **set\_variable** rule, where the type is optional (**(TYPE)? identifier=ID)**. This means that variables can hold values of different types during runtime. 

**Method Parameters:** Method parameters are defined using the **set\_function\_Parameter** rule, where the parameter type is specified but not enforced. This means that functions can accept arguments of different types. 

**Expressions**: The grammar allows different types of expressions to be combined in various ways, such as arithmetic, logical, and comparison expressions. This flexibility is characteristic of dynamically typed languages where type checking happens at runtime. 

**Implicit Type Conversion**: The grammar does not explicitly define rules for type conversion, which implies that the language may perform implicit type conversions to allow operations between different types of values. 

**Recursion** 

The language defined by the grammar file supports recursion. Recursion is the ability of a function to call itself, and there are several aspects of the grammar that indicate where and how recursion can be employed within the defined language: 

The grammar allows for defining of methods (**def\_method**). These methods can invoke other methods, including themselves, thereby facilitating the possibility of recursive function calls. Additionally, the grammar enables method calls (method) within expressions, establishing the potential for recursive patterns when a method calls itself in its own definition.  Recursion can be used in conjunction with conditional statements (such as **if\_Statement**) and loops (**while\_Statement** and **for\_Statement**). If a function conditionally calls itself or iterates by calling itself, it can exhibit recursive behaviour. 

**Translating Into Python** 

**Explanation:** 

As per the assignment guidelines, I must choose between using A visitor interface or listener class to traverse the generated parse tree. I chose to create a visitor class **MyVisitor** to traverse the parse tree and translate the source code into python code. The visitor class is responsible for traversing the parse tree (CST) generated by the ANTLR parser for the source language defined by the given grammar rules. Its main role is to generate corresponding Python code based on the structure and semantics of the input source code. 

While usually, the visitor class is a crucial component of the compiler pipeline, a complete compiler typically involves multiple stages, including lexical analysis (tokenization), syntactic analysis (parsing), semantic analysis, code generation, and possibly optimization. The visitor class in this context serves the purpose of code generation, translating the parse tree into a lower-level target language, such as Python code in this case. 

**Implementation:** 

1. **Initialization and Variables:** 
- The class initializes instance variables for various strings and indicators, such as "**eq**" for the assignment operator, "**ws**" for whitespace, and "**none**" for representing “None” values. 
- It defines instance variables for tracking the current indentation level ("Indent") and the count of encountered "if" statements (**"ifCounter"**). 
2. **Overridden Visit Methods:** 
- The class overrides various visit methods corresponding to different grammar rules. For instance, **visitProgram**, **visitStatement**, **visitStat**, **visitWhile\_Statement**, **visitFor\_Statement**, **visitIf\_Statement**, etc. 
- These overridden methods implement the logic to generate Python code based on the input grammar rules. 
3. **Code Generation Logic:** 
- The overridden methods generate Python code using the provided grammar rules and logic. 
- The "Indent" is used to add appropriate indentation to the generated code. 
- The class constructs the Python code by appending strings to the "**python\_Code**" StringBuilder. 
4. **Expression Handling:** 
- Methods like **getExpression**, **putAdd**, **putAddEq**, and others handle various types of expressions (arithmetic, logical, etc.) based on the provided grammar rules. 
- The visitor evaluates expressions and performs required operations based on the context. 
5. **Method Definitions and Calls:** 
- The visitor supports defining methods using the **"def\_method"** rule and generates corresponding Python code for method definitions. 
- Method calls are handled using the **"visitMethod"** and **"visitFunctionCallExpression"** methods. 
6. **Variable Declarations and Assignments:** 
- The visitor handles variable declarations and assignments using the **"visitVarDeclaration"**, **"visitAssignment"**, and **"visitAssignmentOperators"** methods. 
7. **Control Structures:** 
- The visitor handles "if", "else if", "else", "while", and "for" statements, generating appropriate Python code for these control structures. 
8. **Data Types and Expressions:** 
- The visitor supports different data types (such as Integers, Strings, Booleans) and processes expressions involving these types. N.B. since Python does not support singular character (Char) data types, all chars are converted into Strings. 
9. **Indentation and Formatting:** 
- The visitor ensures proper code indentation and formatting by utilizing the "Indents" method and whitespace management. 

*Figure 2 Parse Tree of print("hello world") ![](Aspose.Words.1f2de021-5180-4c54-9a22-ff96154d9bc5.004.png)![](Aspose.Words.1f2de021-5180-4c54-9a22-ff96154d9bc5.005.png)![](Aspose.Words.1f2de021-5180-4c54-9a22-ff96154d9bc5.006.png)*

**Main Method**

As per the Assignment guidelines, the complier should be able to read the contents of the source code file and translate the source code into python code and then wite the code into python file. My complier achieves all these goals in the main method. The main method serves as the *“entry point”* of the program.  

A breakdown of the main method is as follows: 

**Opening Notepad:** The **openNotepad** method is called to open the "program.txt" file using the Notepad application. This allows a user to write their source code into Notepad. 

**Getting Parse Tree:** The **getTree** method is called to generate the parse tree of the source code using the **ANTLR** lexer and parser. This parse tree represents the hierarchical structure of the source code based on the grammar rules. 

**Creating a Visitor**: An instance of **MyVisitor** (Explained above) is created. This visitor class is responsible for traversing the parse tree and generating Python code based on the structure of the source code. 

**Generating Python Code:** The visit method of the visitor is called with the parse tree as an argument. This method traverses the parse tree and generates the equivalent Python code based on the grammar rules and the logic defined in the visitor class. 

**Printing Python Code:** The generated Python code is printed out, allowing the user to see the result of the translation from the source language to Python. 

**Creating Python File:** Finally, the **convertToPythonFile** method is called to write the generated Python code to a Python file named "**pythonFile.py**". This file is created in the same directory as the Java code. 

**Testing** 

*Figure 3 Sourcecode translated to Python. Figure 4 Launched Notepad for Writing Sourcecode ![](Aspose.Words.1f2de021-5180-4c54-9a22-ff96154d9bc5.007.png)![](Aspose.Words.1f2de021-5180-4c54-9a22-ff96154d9bc5.008.png)![](Aspose.Words.1f2de021-5180-4c54-9a22-ff96154d9bc5.009.png)![](Aspose.Words.1f2de021-5180-4c54-9a22-ff96154d9bc5.010.jpeg)![](Aspose.Words.1f2de021-5180-4c54-9a22-ff96154d9bc5.011.jpeg)*

Due to that fact that Java being a very Object- ![](Aspose.Words.1f2de021-5180-4c54-9a22-ff96154d9bc5.012.jpeg)![](Aspose.Words.1f2de021-5180-4c54-9a22-ff96154d9bc5.013.jpeg)oriented programming friendly language and  hence very modular, this meant that testing  could be done at every level. I first started out by  printing out what the **visitStat** return would be  and slowly went down the tree I reached the end  of the parse tree.   

The only significant problem I had was that every  

time I made a correction to my grammar file  

**SourceLanguage.g4**, I had to regenerate the  

parser files. And as soon as I regenerated to files  

some of the methods in the visitor class  

immediately became redundant or had to be  

modified. This made the iterative development  ![](Aspose.Words.1f2de021-5180-4c54-9a22-ff96154d9bc5.014.png)

process very challenging.**  *Figure 5 Output of translated Python file running.*

One feature that was added after was to not enforce type specification making the source code *dynamically typed.*  

**Conclusion** 

As a whole, my project fulfils most of the initially set goals. The program opens to allows the user to write the source language into Notepad, then after closing saving the file and closing Notepad, the program then generates a parse tree and the adapted base visitor class which then traverse the parse tree each turn translating the source code into python. Then a Python file is created, and the translated python code is written into a python file automatically. Unfortunately, due to the time constraints I was unable develop more additional features such as creating a visual AST Tree and Further error handling. But overall, I would mark this project as a tremendous success.  
