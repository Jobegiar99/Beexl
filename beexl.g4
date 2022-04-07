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

assignment20: ; //pending
pixelFill0: ; //pending
assignment0: ; //pending
print0: ; //pending
conditional0: ; //pending
hyperExp0: ; //pending
superExp0: ;//pending
exp0: ;//pending
term0: ;//pending
factor0: ; //pending
cycle0: ; //pending
vectorOperation0: ; //pending
vectorAttribute0: ;//pending
rgbaOperation0: ;//pending
rgbaAttribute0: ;//pending
hexOperation0: ;//pending
hexAttribute0: ;//pending
block0: ;//pending
main0: ;//pending
body0: ;//pending
functionCall0: ;//pending











