# Small Compiler - BSc Computer Science Project

## University of Essex - CE305 Language and Compilers

### Author: Emmanuel Olaoye  
**Module Supervisor:** Somdip Dey  
**Student ID:** 1905600  
**Date:** 23 August 2023

![Aspose Words 1f2de021-5180-4c54-9a22-ff96154d9bc5 001](https://github.com/Emmanuelolaoye/Jypa/assets/33904106/478de2c9-de7f-4787-a7dc-ae0b7a58fa36)
---

### Project Overview

This project aims to develop a "small compiler" using ANTLR and Java, designed to translate a custom-defined source language into Python code. The source language includes basic programming constructs such as variable declarations, control flow structures (e.g., if-else statements, while loops), and block statements. The final compiler reads the source code, generates a parse tree, and outputs equivalent Python code.

### Key Components

#### 1. ANTLR Framework
   - **ANTLR (ANother Tool for Language Recognition)** is used for generating parsers and lexers from a formal grammar specification. This automates the parsing and lexing processes, enabling developers to focus on language rules and logic implementation.

#### 2. Grammar Rules
   - **Syntax Structure:** Defines how statements and expressions are organized.
   - **Statement Types:** Supports variable assignments, conditional statements, loops, function definitions, and method calls.
   - **Expressions:** Includes arithmetic, logical, comparison operations, and more.
   - **Non-Terminals:** Defines rules for identifiers, operators, data types, and more.

#### 3. Compiler Implementation
   - **Visitor Pattern:** A custom visitor class (`MyVisitor`) traverses the parse tree to generate Python code.
   - **Code Generation:** The visitor handles expressions, control structures, method definitions, and variable assignments, ensuring proper code indentation and formatting.
   - **Dynamic Typing:** The language is dynamically typed, allowing variables to hold values of different types at runtime.

#### 4. Main Method
   - **Workflow:**
     1. Opens Notepad for writing source code.
     2. Generates a parse tree from the source code.
     3. Traverses the parse tree using the visitor class.
     4. Prints and saves the generated Python code to a file.

### Testing and Challenges

Testing was done at various levels, starting from individual statement translation to full parse tree traversal. A significant challenge was the need to regenerate parser files whenever the grammar file was modified, leading to iterative development complexities.

### Conclusion

The project successfully implements a compiler that translates a custom language into Python code. While some features like visual AST representation and advanced error handling were not developed due to time constraints, the core functionality was achieved, marking the project as a success.
