grammar beexl;
WS : [ \t\r\n]+ -> skip ;
FILENAME : 'filename';
READ: 'read';
CREATE: 'create';
CANVAS: 'canvas';
RGBA:'rgba';
VECTOR:'vector';
FORMAT: 'format';
BACKGROUND:'background';
VAR:'var';
FUNCTION:'fun';
VOID:'void';
MAIN:'main';
RETURN: 'return';
PRINT: 'print';
MAX_RED:'MAX_RED';
MAX_BLUE:'MAX_BLUE';
MAX_GREEN:'MAX_GREEN';
MAX_ALPHA:'MAX_ALPHA';
FILL:'fill';
PNG: '.png';
JPG: '.jpg';
JPEG: '.jpeg';
X:'x';
Y:'y';
INT:'int';
FLOAT:'float';
RED:'r';
GREEN:'g';
BLUE:'b';
ALPHA:'a';
IF:'if';
ELSE:'else';
FROM:'from';
TO:'to';
WHILE:'while';
DO:'do';
CANVAS_WIDTH:'CANVAS_WIDTH';
CANVAS_HEIGHT:'CANVAS_HEIGHT';
ID: [a-zA-Z]['_'(a-zA-Z0-9)+]*;
NUMBER: [0-9]+;
STRINGFILENAME: '"' .+'.'('png'|'jpg'|'jpeg')'"';

fileconfig0 :  FILENAME  fileconfig1 vars0*  body0;
fileconfig1: READ 
                        STRINGFILENAME{createFilename($STRINGFILENAME.text)}  ';'
                        | CREATE STRINGFILENAME{createFilename($STRINGFILENAME.text)} ';'
                            canvas0 {createCanvas()}
                            background0;

canvas0:CANVAS NUMBER {valueStack.append($NUMBER.text)} ',' NUMBER {addToValueStack($NUMBER.text)} ';';

background0: BACKGROUND rgba0 {createBackground()}';' ;
  
type0:VECTOR {nameStack.append($VECTOR.text)}
             |RGBA {nameStack.append($RGBA.text)}
             |INT {nameStack.append($INT.text)}
             |FLOAT {nameStack.append($FLOAT.text)};

rgba0: RGBA'(' rgba1 ',' rgba1 ',' rgba1 ',' rgba1  ')'  ;
rgba1:cExtras0|NUMBER {valueStack.append(int($NUMBER.text))};
cExtras0: (MAX_RED|MAX_BLUE|MAX_GREEN|MAX_ALPHA) {valueStack.append(255)};

vector0: VECTOR '(' vector1 ',' vector1 ')';
vector1: NUMBER {valueStack.append($NUMBER.text)}|vExtras0;
vExtras0: CANVAS_HEIGHT{valueStack.append(len(variable_table['canvas']))}
                      | CANVAS_WIDTH   {valueStack.append(len(variable_table['canvas'][0]))};

vars0:VAR ID {nameStack.append($ID.text)} ':' type0 {canCreateVariable()}? ';';

instruction0: (extras0| conditional0|cycle0|while0);

while0: WHILE '(' hyperExp0 ')' '{' extras0+ '}';

extras0:pixelFill0 | assignment0 | print0 | functionCall0;

pixelFill0:FILL (ID|vector0) (ID|rgba0) ';';

assignment0:ID'=' (hyperExp0| vector0 | rgba0) ';'; 

print0: PRINT ';' ;

functionCall0: ID '(' ((ID (',' ID)*))* ')' ';';

conditional0: IF '('  hyperExp0 ')' '{' extras0* '}' conditional1?; 
conditional1: ELSE '{' extras0* '}';

hyperExp0:  superExp0  hyperExp1?;
hyperExp1:'&&' {operatorStack.append("&&")} hyperExp0|'||'  {operatorStack.append("||")}hyperExp0;

superExp0: exp0  superExp1?;
superExp1: ('>'  {operatorStack.append(">")}
                            |'<'  {operatorStack.append("<")}
                            |'<=' {operatorStack.append("<=")}
                            |'>='  {operatorStack.append(">=")}
                            |'=='  {operatorStack.append("==")}
                            |'!='  {operatorStack.append("!=")}) superExp0;

exp0: term0 exp1?;
exp1: '+' {operatorStack.append("+")} exp0| '-' {operatorStack.append("-")} exp0;

term0:  factor0 term1?;
term1: ('*'  {operatorStack.append("*")}
                |'/'  {operatorStack.append("/")}) term0;

factor0:ID {$ID.text in variable_table}?
                   | NUMBER {operatorStack.append($NUMBER.text)}
                   | rgbaAttribute0
                    | vectorAttribute0
                    | '(' {operatorStack.append("(")} hyperExp0 ')'  {operatorStack.pop()};

cycle0: FROM cycle1 TO cycle1 DO  '{' extras0* '}' ; 
cycle1:vector0|rgba0;

vectorOperation0: vectorOperation1 exp0 vectorOperation1 ; 
vectorOperation1: ID {validateID($ID.text,"vector")}?
                                        |vector0
                                        |vectorAttribute0;

vectorAttribute0: ID{validateID($ID.text,'vector')}? '.' (X{nameStack.append("x")}|Y{nameStack.append("y")});
                                        
rgbaOperation0: rgbaOperation1 exp0 rgbaOperation1;
rgbaOperation1: ID {validateID($ID.text,"rgba")}
                                    | rgba0
                                    | rgbaAttribute0;

rgbaAttribute0:  ID{validateID($ID.text,'rgba')}? {nameStack.append($ID.text)} '.' rgbaAttribute1 ;
rgbaAttribute1: RED {nameStack.append("r")}
                                  | GREEN {nameStack.append("g")}
                                  | BLUE {nameStack.append("b")}
                                  | ALPHA {nameStack.append("a")};

block0:'{' (vars0 | instruction0)* '}';

main0:FUNCTION VOID MAIN  '('  ')' block0 {generateQuadruples()};

body0:  functionDefinition0* main0;

functionDefinition0:FUNCTION functionDefinition1 ID
                                        {nameStack.append($ID.text)}
                                        {nameStack.append("function")}
                                        {canCreateVariable()}? '(' functionDefinition2* ')' block0;

functionDefinition1:type0|VOID {nameStack.append("void")};

functionDefinition2:ID{validateID($ID.text,'function')}?':'type0 ','| ID':'type0;