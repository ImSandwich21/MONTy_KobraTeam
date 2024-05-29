//
//    ___   _    _______    _______    ______      _______          _______    _______    _______    __   __   
//   |   | | |  |       |  |  _    |  |    _ |    |   _   |        |       |  |       |  |   _   |  |  |_|  |  
//   |   |_| |  |   _   |  | |_|   |  |   | ||    |  |_|  |        |_     _|  |    ___|  |  |_|  |  |       |  
//   |      _|  |  | |  |  |       |  |   |_||_   |       |          |   |    |   |___   |       |  |       |  
//   |     |_   |  |_|  |  |  _   |   |    __  |  |       |          |   |    |    ___|  |       |  |       |  
//   |    _  |  |       |  | |_|   |  |   |  | |  |   _   |          |   |    |   |___   |   _   |  | ||_|| |  
//   |___| |_|  |_______|  |_______|  |___|  |_|  |__| |__|          |___|    |_______|  |__| |__|  |_|   |_|  
//   KOBRA TEAM: 2101595 - Bruno Eusébio, 2101525 - Daniel Silva, 2003777 - Jorge Gouveia, 2103589 - Inês Marques                                                                     
// 
//  21018 - Compilação - eFolio A
//  ficheiro: MONTyPython.g4
//  data: 29-04-2024

grammar MONTyPython;

options {
    language = Python3;
}

// Definição das regras do Parser
// Define o programa como uma sequência de comandos até o fim do arquivo.
program: command* EOF           # Prog
        ;                              

// Define um comando como sendo uma dessas opções.
command
    : declaration
    | assignment
    | functionCall
    | forLoop
    | whileLoop
    | inputStatement
    | printStatement
    | ifStatement
    | returnStatement
    ; 

expression
    : NOT? LPAREN expression RPAREN                         # GroupExp
    | expression (POW)                                      # Pow
    | expression op=(MULT|DIV|MOD|DIV_INT) expression       # MultDiv
    | expression op=UNARY expression                        # UnaryOp
    | expression (RELATIONAL_OP) expression                 # Relational
    | expression op=LOGIC expression                        # Logical
    | ID LBRACK ID RBRACK                                   # ListIndex
    | ID                                                    # Variable
    | UNARY? (INT|FLOAT)                                    # Number                                            
    ;

// ----------------------- Variáveis -----------------------
declaration
    : INT_TYPE ID ('=' UNARY? INT)? (COMMA ID ('=' UNARY? INT)?)*                           # IntDeclaration
    | FLOAT_TYPE? ID ('=' UNARY? (INT|FLOAT))? (COMMA ID ('=' UNARY? (INT|FLOAT))?)*        # FloatDeclaration
    | INT_TYPE LBRACK RBRACK ID                                                             # IntListDeclaration
    | FLOAT_TYPE LBRACK RBRACK ID                                                           # FloatListDeclaration
    | 'def' FLOAT_TYPE? ID LPAREN (((FLOAT_TYPE|INT_TYPE) (LBRACK RBRACK)?)? ID (COMMA ((FLOAT_TYPE|INT_TYPE) (LBRACK RBRACK)?)? ID)*)? RPAREN ':' # FloatFunctionDeclaration
    | 'def' INT_TYPE ID LPAREN (((FLOAT_TYPE|INT_TYPE) (LBRACK RBRACK)?)? ID (COMMA ((FLOAT_TYPE|INT_TYPE) (LBRACK RBRACK)?)? ID)*)? RPAREN ':' # IntFunctionDeclaration
    | 'def' INT_TYPE LBRACK RBRACK ID LPAREN (((FLOAT_TYPE|INT_TYPE) (LBRACK RBRACK)?)? ID (COMMA ((FLOAT_TYPE|INT_TYPE) (LBRACK RBRACK)?)? ID)*)? RPAREN ':' # IntListFunctionDecl
    | 'def' FLOAT_TYPE LBRACK RBRACK ID LPAREN (((FLOAT_TYPE|INT_TYPE) (LBRACK RBRACK)?)? ID (COMMA ((FLOAT_TYPE|INT_TYPE) (LBRACK RBRACK)?)? ID)*)? RPAREN ':' # FloatListFunctionDecl
    ;

assignment
    : ID '=' expression                             # VariableAssign
    | ID '=' LBRACK INT (COMMA INT)* RBRACK         # ListAssign
    ;

// Tipo de variável.
varType 
    : FLOAT_TYPE
    | INT_TYPE
    ; 

// ----------------------- Listas -------------------------

listFunction
    : 'size' LPAREN ID RPAREN                                       # ListSize
    | 'add' LPAREN ID COMMA expression COMMA expression RPAREN      # ListAdd
    | 'remove' LPAREN ID COMMA expression RPAREN                    # ListRemove
    ;

// ----------------------- Funções -------------------------

 // Chamada de funções.
 functionCall
     : ID LPAREN (parameter (COMMA parameter)*)? RPAREN     # FuncCall
     ;    

// Parâmetros de funções.
 parameter
     : (varType (LBRACK RBRACK)?)? ID
     | expression
     ;

// // ----------------------- Ciclos -----------------------
 forLoop
    : 'for' ID 'in' (ID|'range' LPAREN expression (COMMA expression)* RPAREN) ':' # ForInstruction
    ;
    
 whileLoop
     :'while' expression ':'    # WhileInstrunction
     ;

// ----------------------- Condicionais -----------------------
 
 ifStatement
    : 'if' expression ':'  ('elif' expression ':' )* ('else' ':' )? # IfInstruction
    ;

// ----------------------- Entrada e Saída -----------------------
 
 inputStatement
     :varType? ID '=' 'input' LPAREN STRING RPAREN      # InputFunction
     ;

 printStatement
    : 'print' LPAREN (expression|STRING) (COMMA (expression|STRING))* RPAREN # PrintFunction
    ;

 returnStatement
     : 'return' (expression) (COMMA (expression))*  # ReturnFuncion
     ;

// ----------------------- Operadores -----------------------
UNARY: MINUS | PLUS;

LOGIC: AND | OR;

NOT: 'not';

// ----------------------- Regras do Lexer -----------------------
COMMENT: '#' ~[\r\n]* -> skip;                  // Ignora comentários.
INT_TYPE: 'int';                                // Define o tipo de variável inteira.
FLOAT_TYPE: 'float';                            // Define o tipo de variável flutuante.
ID: [a-zA-Z_][a-zA-Z0-9_]*;                      // Identifica nomes de variáveis e identificadores.
INT: [0-9]+;                                    // Representa números inteiros.
FLOAT: INT('.'[0-9]*)?([eE][+-]?[0-9]+)? ;      // Representa números flutuantes.
MULT: '*';                                      // Operador de multiplicação.
DIV: '/';                                       // Operador de divisão flutuante.
PLUS: '+';                                      // Operador de adição.
MINUS: '-';                                     // Operador de subtração.
MOD: '%';                                       // Operador de resto de divisão inteira.
DIV_INT: '//';                                  // Operador de divisão inteira.
POW : '**';                                     // Operador de potenciação.
LBRACK: '[';                                    
RBRACK: ']';                                    
LPAREN: '(' ;
RPAREN: ')' ;
COMMA: ',' ;
STRING: '"' ~["\r\n]* '"' | '\'' ~['\r\n]* '\''; // Representa strings literais.
AND: 'and';
OR: 'or';
NOR: 'nor';
RELATIONAL_OP: '<' | '<=' | '>' | '>=' | '!=' | '=='; // Operadores relacionais.
WS: [ \t\n\r]+ -> skip; // Ignora espaços em branco.
