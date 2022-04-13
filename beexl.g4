grammar beexl;

FILENAME : 'filename';
READ: 'read';
CREATE: 'create';
CANVAS: 'canvas';
HEX:'hex';
RGBA:'rgba';
VECTOR:'vector';
FORMAT: 'format';
BACKGROUND:'background';
VAR:'var';
FUNCTION:'fun';
VOID:'void';
MAIN:'main';
RETURN: 'return';
X:'x';
Y:'y';
RED:'r';
GREEN:'g';
BLUE:'b';
ALPHA:'a';
IF:'if';
ELSE:'else';
FROM:'from';
TO:'to';
DO:'do';
CANVAS_WIDTH:'CANVAS_WIDTH';
CANVAS_HEIGHT:'CANVAS_HEIGHT';
A_HEX:'A';
B_HEX:'B';
C_HEX:'C';
D_HEX:'D';
E_HEX:'E';
F_HEX:'F';
ID: [a-z]['_'(a-zA-Z0-9)+]*;
DIGIT: [0-9];
NUMBER: DIGIT+;
MAX_RED:'MAX_RED';
MAX_BLUE:'MAX_BLUE';
MAX_GREEN:'MAX_GREEN';
MAX_ALPHA:'MAX_ALPHA';

FILL:'fill';

WS : [ \t\r\n]+ -> skip ;

fileconfig0 : WS* 'filename' WS* fileconfig1 WS* fileconfig2;
fileconfig1: 'read' fileconfig11
                        | 'create' fileconfig12;
fileconfig11: file0 ';' colorFormat0;
fileconfig12: file0 ';' canvas0 colorFormat0 background0;
fileconfig2: vars0 fileconfig2 
                        | body0;

file0: '"'  .*  file1 '"';
file1: '.png.'
            | '.jpg'
            | '.jpeg';

canvas0: WS* 'canvas' WS* NUMBER WS* ',' WS* NUMBER WS*;

background0: WS* 'background' WS*  background1 WS* ';';
background1: hex0
                            | rgba0;

colorFormat0: FORMAT colorType0 WS* ';' ;

colorType0: RGBA 
                            | HEX;

type0: WS* VECTOR WS*
                | colorType0;

rgba0: WS* RGBA WS* '(' WS* rgba1 ;
rgba1: rgba2 
                | WS* ')' WS* ';';

rgba2: cExtras0 
                | NUMBER  | ;

cExtras0: MAX_RED
                        | MAX_BLUE
                        | MAX_GREEN
                        | MAX_ALPHA;

hex0: '#';
hex1 : DIGIT hex2
            | hexChar0 hex2;

hex2: hex1 
            | ;

hexChar0: A_HEX
                      | B_HEX
                      | C_HEX
                      | D_HEX
                      | E_HEX
                      | F_HEX;

vector0: WS* VECTOR WS* '(' vector1;
vector1: NUMBER vector2
                  | vExtras0 vector2;

vector2: ',' vector1 | ')' WS* ';';

vExtras0: CANVAS_HEIGHT 
                      | CANVAS_WIDTH;

vars0: WS* VAR WS* ID WS* vars1;
vars1: HEX vars11 
             | RGBA vars11
             | VECTOR vars12; 
vars11: WS* ':' colorType0 ';'
              | WS* ':' colorType0 assignment20 ';';
vars12: VECTOR assignment20
                | VECTOR ';';

instruction0: extras0 
                            | conditional0
                            | cycle0;

extras0: pixelFill0
                   | assignment0
                   | print0
                   | functionCall0;

//pending

assignment20: '='   | RGBA
                    | HEX 
                    | VECTOR; 

pixelFill0: FILL pixelFill1  pixelFill2 ';';
pixelFill2: | ID
            | RGBA
            | HEX;
pixelFill1: | ID
            | VECTOR;

assignment0: ID* assignment20; 
PRINT: 'print' ';'; 
print0: PRINT; 
conditional0: IF '(' hyperExp0 ')' '{' extras0 + '}' ; 
hyperExp0: ; 
superExp0: ;

exp0: term0 term1;
term1: term2 | ;
term2: term3 exp0;
term3: '+' | '-';

term0: factor0 factor1;
factor1: factor2 | ; 
factor2: factor3 term0;
factor3: '*' | '/';


factor0: ID | '(' superExp0 ')'; 
cycle0: FROM cycle1 TO cycle1 DO '{' extras0+ '}'; 
cycle1: VECTOR | colorFormat0;

vectorOperation0: vectorOperation1 exp0 vectorOperation1; 
vectorOperation1: ID | VECTOR | vectorAttribute0;

vectorAttribute0: ID '.'    | X
                            | Y;

rgbaOperation0: rgbaOperation1 exp0 rgbaOperation1;
rgbaOperation1: ID | RGBA | rgbaAttribute0;

rgbaAttribute0: ID '.'  | RED
                        | GREEN
                        | BLUE
                        | ALPHA;

hexOperation0: hexOperation1 exp0 | hexOperation1;
hexOperation1: ID | HEX | hexAttribute0;

hexAttribute0: ID '.'   | RED
                        | GREEN
                        | BLUE;
block0: '{' block1+ '}';
block1: VAR | instruction0;

BLOCK: '';
main0: FUNCTION VOID MAIN '(' ')' block0 ;
body0: FUNCTION+ MAIN;
functionCall0: ID '(' functionCall1 ')' ',';
functionCall1: ID | ID ',' functionCall1 ;










