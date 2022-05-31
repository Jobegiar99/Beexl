from email.policy import default
from antlr4 import *
from beexlLexer import beexlLexer
from beexlListener import beexlListener
from beexlParser import beexlParser
from collections import defaultdict
from mySemantic import *
from VirtualMachine import virtualMachine
"""
TO DO: add rules to handle special words with a parenthesis and no space
"""
test_valid_2 = """
filename create "beexl.png";
canvas 123, 123;
background rgba (10,10,10,123 );
var myVector: vector;

fun void myXD ( ){
    myVector = vector ( 12 , 12 );
}

fun void main () {
    myVector = vector ( 10, 10);
    var merg : rgba ;
    var al : int ;
    al =  B + ( A + ( B * ( A - fdh ) ) ) - B;
    print;
    merg = rgba ( 12 , 125 , 255 , 0 );
    var xD: vector;
    xD = vector (10,15) ;
    if ( A < B && B < A ) {
        print;
    }
    else {
        xD = A * B < ( A + B ) * C ;
    }
    
    while ( A == B || B < C ){
        print;
        fill myVector , merg;
    }

    if ( ( A * B < C * A ) && ( A - B >= C + A || A < B ) )  {
        print;
    }
}
"""

test_valid_3 = """
filename create  "beexl.png";
canvas 100 , 100 ;
background rgba ( 10 , 12 , 14,10 ) ;

var al: vector;
var ol: rgba;
var olo: int;

fun void ameno ( ert :vector , olo:int , eort : int , eorkgoekro : rgba ){
    ameno (al , olo , olo , ol );
}

fun void main () {
    al = vector ( 2 , 2 );
    ol = rgba ( 10 , 1 , 12 , 255 );
    olo = 5;
    fill al,ol;

    al = vector ( 1 , 2 );
    ol = rgba ( 10 , 112 , 12 , 255);

    fill al,ol;
    var olo : int;
    var A : int;
    
    olo =  olo * 4 + (  3 + 4  ) * 34 + 234;

    fill al , ol;

    ameno ( al, olo, olo, ol );

    if ( 3 < 234 && 234 >= 123 )
    {
        olo = 2;
    }
    else
    {
        olo = 3;
    }
    while ( 3 < 2 && 234 >= 123 )
    {
        olo = 4;
    }
}
"""

test_valid_4 = """
filename read "beexl.png";

fun void ameno ( ol : int, ulu: int ){
    if ( 4 < 3 )
    {
        ameno ( ol , ulu ) ;
    }
    else
    {
        print;
    }
}

fun void main (){
    var olo:int;
    var elu: int;
    var ele:rgba;
    var ulu:vector;
    olo = 4 ;
    elu = olo * 2 + ( 10 / 2  + ( 14 * ( 2 / 2 )));
    ele = rgba ( 255 , 255 , 255  , 255 );
    ulu = vector ( 14 , 15 );
    if ( 13 * 23 < 14 + 12 ){
        print;
    }
    fill ulu , ele ;
    ameno ( olo , olo );
    while ( olo < (olo / 2) + 4 ){
        olo = olo + 1 ;
    }
}
"""

test_valid_5 = """
filename read "beexl.png";

var color: rgba;
var dot: rgba;
var previous: vector;
var current: vector;
var increment: int;
var row: int;

fun int ameno ( olo:int ) {
    fill previous , color;
    fill current , dot;
    previous = vector ( row  , 20 );
    row = row + increment;
    current = vector ( row , 20 );
    print ;
    if ( ( increment == 1 && row < 100 ) || ( increment == -1 && row > 0 )  ){
        row = ameno ( 3 + 12 * ( 12 - 34 ) );
    }
    return olo * 2;
}

fun int test ( ol: int ) {
    return ( ol * ol ) ;
}

fun void main (){
    var iterations : int;
    iterations = 0 ;
    row = 4;
    increment = 1;
    color = rgba ( MAX_RED , 225 , 120, 255 ) ;
    dot = rgba ( MAX_RED , 0 , 0 , MAX_ALPHA );
    previous = vector ( 0 , 2 );
    current = vector ( 0 , 2 );
    row = test ( 123 )  ;
    while ( iterations < 100  ){
        increment = 1;
        increment = -1;
        color.r = 4;
        color.g = 2;
        color.b = 4;
        color.a = 123 + color.r - 123;
        iterations = iterations + 1;
    }
}
"""

test_valid_6 = """
filename read "beexl.png";

var row: int;

fun void main (){
    var olo : int;
    var elu : int;
    var ele : rgba;
    var ulu : vector;
    row = 0;
    olo = 4 ;
    elu = olo ;
    ele = rgba ( 255 , 255 ,  325 , 255 );
    ulu = vector ( olo , olo * 2 + 3 + 4 + 5 + 6 + 7 + 8 ) ;
    var first: int;
    var second:int;
    print;
    await 1000 ;
    print;
}

"""


test_valid_7 = """
filename read "beexl.png"

fun void main () {
    var al: vector;
    al: 
}

"""

test_print = """

filename read "beexl.png"

fun int test ( value:int ){
    return  value * value ;
}

fun void main () {
    print ( 4 * 2 - 2 , test ( test ( 2 * test ( 2 * test ( 2 ) ) * test ( 2 ) ) ) * test ( 2 ) );
    print ( 3 );
    await 1000;
    show_canvas;
}
"""
tests = [test_print]

for test in tests:
    print("--------------")
    print("Test: ", tests.index(test) + 1)
    lexer = beexlLexer(InputStream(test))
    stream = CommonTokenStream(lexer)
    parser = beexlParser(stream)
    tree = parser.fileconfig0()
    listener = beexlListener()
    ParseTreeWalker().walk(listener,tree)

    counter = 0
    for p in beexlSemantic.quadruples:
        print(counter, p)
        counter += 1

    virtualMachine.SetMachine(beexlSemantic.quadruples)
    virtualMachine.ReadQuadruples()
    
    #for key in memory.memory_table:
    #    print(key,memory.memory_table[key])
