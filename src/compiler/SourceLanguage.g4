grammar SourceLanguage;

// Program Rule: Represents the entire program
program: stat EOF;

// Block Rule: Represents a block of statements
stat: NEWL* | (NEWL* statement NEWL*)* ;

// Statement Rule: Represents various types of statements in the program
statement: set_variable
         | if_Statement
         | while_Statement
         | for_Statement
         | def_method
         | method;


// Variable Assignment Rule: Handles variable declarations, assignments, and operators
set_variable:
      (TYPE)? identifier=ID (EQUALS expr=expression)? # VarDeclaration // makes declating type optional
    | identifier=ID EQUALS expr=expression # Assignment
    | identifier=ID op=ASSIGN_OPERATOR expr=expression # AssignmentOperators
    | identifier=ID op=(PLUSPLUS | MINUSMINUS) # AssignmentIncDec;

// If Statement Rule: Represents an if statement with optional else if and else blocks
if_Statement: IF LPAREN expression RPAREN LCURLY stat  NEWL? (ELSEIF LPAREN expression RPAREN LCURLY stat RCURLY)* NEWL? (ELSE LCURLY elseBlock=stat RCURLY)? NEWL? RCURLY;

// Function Definition Rule: Defines a function with optional return value
def_method: METHOD  identifier=name LPAREN (set_parameter)? RPAREN LCURLY stat (RETURN  returnValue=expression )? NEWL* RCURLY ;

// Parameter Declaration Rule: Specifies parameters for a function
set_parameter: set_function_Parameter? (COMMA set_function_Parameter)* ;

// Function Parameter Assignment Rule: Defines parameter types and names
set_function_Parameter: TYPE identifier=name ;

// Function Call Rule: Represents a function call
method: identifier=name LPAREN expression? (COMMA expression)* RPAREN ;

// While Statement Rule: Represents a while loop
while_Statement: WHILE cond=expression LCURLY stat RCURLY ;

// For Statement Rule: Represents a for loop
for_Statement: FOR LPAREN  cond=expression SEMI_COLON step=set_variable RPAREN LCURLY stat RCURLY ;

// varInitialise=varAssignment COMMA



// Expression Rule: Represents various types of expressions
expression:op=(PLUS | MINUS) expression # UnaryExpression
    | l_expr=expression op=(MULTIPLY | INDICES) r_expr=expression # MultiplyExpression
    | l_expr=expression op=(DIVISION | REMAINDER ) r_expr=expression # DivisionExpression
    | l_expr=expression op=(PLUS | MINUS) r_expr=expression # Plus_Minus
    | l_expr=expression op=(AND | OR) r_expr=expression # AndOrExpression
    | l_expr=expression op=(EQUAL_TO | NOT_EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | LESS_THAN | LESS_THAN_EQUAL) r_expr=expression # ComparisonExpression
    | negate=NOT expression # NegateExpression
    | name # IdExpression
    | method # FunctionCallExpression
    | NULL # NullExpression
    | LPAREN expression RPAREN # BracketsExpression
    | NUMBER # NumberExpression
    | STRING # StringExpression
    | BOOLEAN # BooleanExpression;

// Condition Rule: Represents conditions used in loops and if statements
//condition: expression;

// Terminal Rule for Identifier: Defines an identifier (variable or function name)
name: ID ;  //Something to do with not printing out in an error message, since ID is a terminal

// Token Definitions and Explanations

// Assignment Operators
ASSIGN_OPERATOR: (PLUS | MINUS | MULTIPLY | DIVISION | REMAINDER ) EQUALS ;

// Increment and Decrement Operators
MINUSMINUS: MINUS MINUS ;
PLUSPLUS: PLUS PLUS ;

// Null and Boolean Tokens
NULL: 'null' ;
BOOLEAN: 'True'|'False' ;

// Control Keywords
IF: 'if' ;
ELSEIF: 'elif' ; // Used for "else if" statements
ELSE: 'else' ;
WHILE: 'while' ;
FOR: 'for' ;

// Parentheses and Brackets
LPAREN: '(' ; // l_expr Parentheses
RPAREN: ')' ; // r_expr Parentheses
LCURLY: '{' ; // l_expr Curly Brace
RCURLY: '}' ; // r_expr Curly Brace


// Other Operators
EQUALS: '=' ; // Assignment operator
EQUAL_TO: '==' ; // Equal to operator
NOT_EQUAL: '!=' ; // Not equal to operator
GREATER_THAN: '>' ; // Greater than operator
GREATER_THAN_EQUAL: '>=' ; // Greater than or equal to operator
LESS_THAN: '<' ; // Less than operator
LESS_THAN_EQUAL: '<=' ; // Less than or equal to operator
NOT: '!' ; // Logical NOT operator
AND: 'and' ; // Logical AND operator
OR: 'or' ; // Logical OR operator
MULTIPLY: '*' ; // Multiply operator
INDICES: '^' ; // Exponentiation operator
DIVISION: '/' ; // Division operator
REMAINDER : '%' ; // Modulus operator
PLUS: '+' ; // Addition operator
MINUS: '-' ; // Subtraction operator
SEMI_COLON: ';';
DECIMAL: '.';

// Method Operators
METHOD: 'method'; // Method Token
COMMA: ',' ; // Comma separator
RETURN: 'ret' ; // Return keyword

// Data Types
TYPE: ('int' | 'fl' | 'str' | 'bool'|'char') ; // Available data types

// Identifier Rule
ID: [a-zA-Z][a-zA-Z0-9_]* ; // Identifier names

// Number and String Tokens
NUMBER: (DECIMAL DIGITS+ | DIGITS+ DECIMAL  | DIGITS+) DIGITS* ([eE][-+]? DIGITS+)? ; // Numeric values
STRING: '"' CHARACTER*? '"' ; // String values
DIGITS: [0-9] ;

// Whitespace and Newline Tokens
WS: [ \t]+ -> skip; // Whitespace characters
NEWL: ('\n' | '\r' | WS)+ ; // Newline characters

// Comment Rule
COMMENT : ('//' ~[\r\n]*) -> skip; // Single-line comment

// Character Rule
CHARACTER: [a-zA-Z0-9 \\!"£$%^&*()_+={}[\]@~<:?>,;/.-] ; // Characters used in strings
