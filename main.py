from email.policy import default
from antlr4 import *
from beexlLexer import beexlLexer
from beexlListener import beexlListener
from beexlParser import beexlParser
from collections import defaultdict
from beexlSemantic import *
from VirtualMachine import VirtualMachine, virtualMachine
from memoryManager import MemoryManager


test_print = """
filename create "beexl.png";
canvas 100,100;
background rgba ( 10 , 10 , 10 , 244 );

fun int test ( value:int ){
    return  value * value ;
}

fun void main () {

    print ( 4 * 2 - 2 , test ( 232 )  - test ( 231 ));
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


fun void sortArray ( ) {
    var i: int;
    var j: int;
    var temp: int;
    i = 0;
    
    while ( i < 5 ) {

        j = i + 1 ;

        while ( j < 5 ) {

            if ( arr2 [ i ] < arr2 [ j ] ) {
                temp = arr2[j] ;
                arr2[j] = arr2[i];
                arr2[i] = temp ;
            }
            j = j + 1;
        }
        print ( i );
        i = i + 1;
    }
}

fun void main () {
    var i: int;
    i = 0;
    while ( i < 4 ){
        arr1 [ i ] = i + 2 ;
        print ( arr1 [ i ] );
        i = i + 1;
    }
    print ( ( arr1[ arr1[1] ] + arr1[3] ) * ( arr1[3] + arr1[3] ) );
    i = 0;
    while ( i < 5 ){
        arr2[i] = 5 - i;
        i = i + 1;
    }
    sortArray ();
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
    n = 15;
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
    print ( fibbo2 , getFibbo ( n ) );
    i = 1;
    while ( i <= n ) {
        fact = fact * i;
        i = i + 1;
    }
    print ( fact , getFact ( n ) ) ;
}
"""

ameno = """
filename create "square.png";
canvas 100,100 ;
background rgba ( 0, 0 , 0 ,255);

var row : vector;
var color:rgba;

fun void ameno ( limit: int ) {
    row = vector ( 10, 10 );
    while ( row.x < limit ){
    
        fill row, color;

        row.x = row.x + 1;
    }
}

fun void ingerimo ( limit: int ) {

    while ( row.y < limit ) {

        fill row , color;

        row.y = row.y + 1;
    }
}

fun void adapare ( limit: int ) {

    while ( row.x > limit ) {

        fill row, color;

        row.x = row.x - 1;

    }
}

fun void dorime ( limit: int ) {

    while ( row.y > limit ){

        fill row, color;

        row.y = row.y - 1;
    }
}

fun void song () {
    var upperLimit:int;
    var lowerLimit: int;
    upperLimit = 90;
    lowerLimit = 9;
    while ( upperLimit > lowerLimit ){
        ameno ( upperLimit );
        ingerimo ( upperLimit  );
        adapare ( lowerLimit + 1  );
        dorime ( lowerLimit + 1);
        upperLimit = upperLimit - 1;
        lowerLimit = lowerLimit + 1;
    }

}

fun void main (){

    color = rgba ( 255, 255 ,255 ,255) ;

    var olo: vector;

    olo = vector ( 1012 ,  10 );

    row = vector ( 10 , 10 );


    song ( ) ;

    save_animation ;
}

"""


tests = [ameno]

for test in tests:
    lexer = beexlLexer(InputStream(test))
    stream = CommonTokenStream(lexer)
    parser = beexlParser(stream)
    tree = parser.fileconfig0()
    listener = beexlListener()
    ParseTreeWalker().walk(listener,tree)

    coun = 0
    with open("file.bxl",mode='w') as file:
        line = ""
        for quadruple in beexlSemantic.quadruples:
            line+= " "
            for element in quadruple:
                counter = 15
                for char in str(element):
                    counter -= 1
                    line += str(char)
                while counter > 1:
                    counter -= 1
                    line += " "
                line += " "
            line += "\n"

            coun += 1

        file.write(line)

    virtualMachine.SetMachine(beexlSemantic.quadruples)
    virtualMachine.ReadQuadruples()
    
    # for key in memory.memory_table:
    #    print(key,memory.memory_table[key])
