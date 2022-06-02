from email.policy import default
from antlr4 import *
from beexlLexer import beexlLexer
from beexlListener import beexlListener
from beexlParser import beexlParser
from collections import defaultdict
from beexlSemantic import *
from VirtualMachine import VirtualMachine, virtualMachine
from memoryManager import MemoryManager
"""
TO DO: add rules to handle special words with a parenthesis and no space
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
        print ( ol , ulu ) ;
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
        print ( olo, elu );
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
    show_canvas ;
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
        increment = ameno ( increment );
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
    show_canvas;
    await 1000 ;
    show_canvas;
}
"""

test_valid_7 = """
filename read "beexl.png"

fun void main () {
    var al: vector; 
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

array_test = """
filename read "beexl.png";
var row:int;
var arr1[ 4 ]:int;
var arr2[ 5 ]:int;
var col:int;

fun void main (){
    row = arr1 [ 10 * 23 * 2 + arr2 [ 12 * 123 ] ];
    await 1;
    arr1 [ arr1 [ 12 ] + 12  ] = arr1 [ 2 * 3 ] + 2;
}
"""

array_test_2 = """
filename read "beexl.png";
var row:int;
var ol[ 4 ]:int;
var ul[ 5 ]: int;
var col:int;

fun void main (){
    ol[0] = 2;
}
"""

fibbo_fact_test = """\
filename read "beexl.png";

var i:int;
var n: int;
var fact:int;
var fibbo1: int;
var fibbo2: int;
var fibbo3: int;

fun int getFact ( n: int ) {
    var p: int;
    p = n;
    if ( n == 1 ) {
        return n  ;
    }
    return  p  * getFact ( n - 1 )  ;
}

fun int getFibbo ( i : int ){
    if ( i == 0){
        return 0;
    }
    if ( i == 1){
        return 1;
    }

    return  getFibbo ( i - 1 ) + getFibbo ( i - 2 ) ;
}

fun void main (){
    var i : int ;
    var n : int;
    n = 10;
    fact = 1;
    i = 1;
    fibbo1 = 0;
    fibbo2 = 1;
    fibbo3 = 1;
    while ( i < n ) {
        fibbo3 = fibbo1 + fibbo2;
        fibbo1 = fibbo2;
        fibbo2 = fibbo3;
        i = i + 1;
    }
    print ( fibbo2 );
    print ( getFibbo ( n ) );
    i = 1;
    while ( i <= n ) {
        fact = fact * i;
        i = i + 1;
    }
    print ( fact );
    fact = getFact ( n ) ;
    print ( fact );
}
"""

iterative_test = """\
filename read "beexl.png";

var i:int;
var n: int;
var fact:int;
fun int getFact ( n: int ) {
    if ( n  == 1 ) {
        return n ;
    }

    return getFact ( n - 1 ) * ;
}

fun void main (){

    fact = getFact ( 5 + 6 );

    print ( 0, fact , 0 );
}
"""

tests = [factorial_test]

for test in tests:
    print("--------------")
    print("Test: ", tests.index(test) + 1)
    lexer = beexlLexer(InputStream(test))
    stream = CommonTokenStream(lexer)
    parser = beexlParser(stream)
    tree = parser.fileconfig0()
    listener = beexlListener()
    ParseTreeWalker().walk(listener,tree)

    coun = 0
    with open("file.bxl",mode='w') as file:
        line = "|"
        for quadruple in beexlSemantic.quadruples:
            line+= "|"
            for element in quadruple:
                counter = 15
                for char in str(element):
                    counter -= 1
                    line += str(char)
                while counter > 1:
                    counter -= 1
                    line += " "
                line += "|"
            line += "\n"

            coun += 1

        file.write(line)


    virtualMachine.SetMachine(beexlSemantic.quadruples)
    virtualMachine.ReadQuadruples()
    
    #for key in memory.memory_table:
    #    print(key,memory.memory_table[key])
