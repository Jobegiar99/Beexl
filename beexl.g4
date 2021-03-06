grammar beexl;

fileconfig0 :FILENAME fileconfig1 (vars0|arrayInit0)* body0;
fileconfig1:READ STRINGFILENAME';'
           |CREATE STRINGFILENAME';'canvas0 background0;

canvas0:CANVAS NUMBER','NUMBER';';

background0:BACKGROUND rgba0';';
  
type0:VECTOR|RGBA|INT|FLOAT;

rgba0:RGBA'('rgba1','rgba1','rgba1','rgba1')';
rgba1:cExtras0|exp0;
cExtras0: (MAX_RED|MAX_BLUE|MAX_GREEN|MAX_ALPHA);

vector0:VECTOR'('vector1','vector1')';
vector1:vExtras0|exp0;
vExtras0:CANVAS_HEIGHT|CANVAS_WIDTH;

vars0:VAR ID':'type0';';

instruction0:(extras0|conditional0|while0);

while0: WHILE'('hyperExp0')'while1;
while1:'{'extras0+'}';

extras0:pixelFill0
        |assignment0
        |print0
        |return0
        |showCanvas0
        |functionCall0';'
        |specialAssignment0
        |arrayAssign0
        |await0
        |while0
        |conditional0
        |showCanvasChanges0;

showCanvasChanges0: ANIMATECHANGES';';

await0: AWAIT NUMBER';';

pixelFill0:FILL(ID|vector0)','(ID|rgba0)';'; 

assignment0:ID'='(hyperExp0| vector0 | rgba0)';'; 

specialAssignment0: (rgbaAttribute0|vectorAttribute0)'='(exp0)';';

print0:PRINT'('print1+')'';';
print1:print2(','print2)*;
print2:exp0;

showCanvas0:SHOW_CANVAS';';


conditional0: IF'('hyperExp0')'conditional1;
conditional1:'{'extras0*'}'conditional2?;
conditional2: ELSE'{'extras0*'}';

hyperExp0:superExp0 hyperExp1?;
hyperExp1:('&&'||'||')hyperExp0;

superExp0:exp0 superExp1?;
superExp1: ('>'|'<'|'<='|'>='|'=='|'!=')superExp0;

exp0: term0 exp1?;
exp1:('+'|'-')exp0;

term0:factor0 term1?;
term1: ('/'|'*')term0;

factor0:alpha0
        |vectorAttribute0
        |rgbaAttribute0;

 alpha0:functionCallFactor0
     |lambda0;

lambda0:arrayExpCall0
       |gama0;

gama0:expressionRestart0
     |omicron0;

omicron0:ID
        |NUMBER
        |DECIMAL_NUMBER;
        

arrayInit0:VAR ID'['NUMBER']'':'type0';';

arrayExpCall0: ID'['arrayExpCall1']';
arrayExpCall1: exp0;

arrayAssign0: ID'['arrayAssign1']''='arrayAssign2';';
arrayAssign1:exp0;
arrayAssign2:exp0; //looks redundandt but each one has its own listener action


functionCallFactor0:ID'('functionCall1*')';
       
functionCall0:ID'('functionCall1*')';
functionCall1:functionCall2(','functionCall2)*;
functionCall2:exp0;

expressionRestart0:'('hyperExp0')';

vectorAttribute0:ID'.'(X|Y);

rgbaAttribute0:ID'.'rgbaAttribute1 ;
rgbaAttribute1:RED|GREEN|BLUE|ALPHA;

block0:'{'(vars0|instruction0)*'}';

main0:FUNCTION VOID MAIN'('')'block0;

body0:functionDefinition0* main0;

functionDefinition0:FUNCTION functionDefinition1 ID'('functionDefinition2*')'functionDefinition3;

functionDefinition1:type0|VOID;

functionDefinition2:ID':'type0','|ID':'type0;
functionDefinition3:functionBlock0;

functionBlock0:'{'(vars0|arrayInit0|instruction0)*'}';

return0:RETURN exp0';';


WS : [ \t\r\n]+ -> skip ;
FILENAME : 'filename';
READ: 'read';
CREATE: 'create';
CANVAS: 'canvas';
RGBA:'rgba';
VECTOR:'vector';
ANIMATECHANGES:'save_animation';
BACKGROUND:'background';
VAR:'var';
FUNCTION:'fun';
VOID:'void';
MAIN:'main';
RETURN: 'return';
PRINT:'print';
SHOW_CANVAS:'show_canvas';
MAX_RED:'MAX_RED';
MAX_BLUE:'MAX_BLUE';
MAX_GREEN:'MAX_GREEN';
MAX_ALPHA:'MAX_ALPHA';
FILL:'fill';
AWAIT:'await';
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
TO:'to';
WHILE:'while';
CANVAS_WIDTH:'CANVAS_WIDTH';
CANVAS_HEIGHT:'CANVAS_HEIGHT';
NUMBER: '-'?[0-9]+;
DECIMAL_NUMBER: NUMBER'.'[0-9]+;
STRINGFILENAME: '"' .+?'.'('png'|'jpg'|'jpeg')'"';
ID: ([a-zA-Z]['_'(a-zA-Z0-9)+]*);
