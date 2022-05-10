from email.policy import default
from antlr4 import *
from beexlLexer import beexlLexer
from beexlListener import beexlListener
from beexlParser import beexlParser
from collections import defaultdict
"""
TO DO: add rules to handle special words with a parenthesis and no space
"""
test_valid_1 = """
filename create "beexl.jpg";
canvas 123 , 23423 ;
background rgba ( 10,12,14,12 ) ;

var i: rgba;
var i2: vector;
var er: rgba;
var AD: float;


fun float aA ( ba : vector  ){
    var algerg : vector;
    fill vector ( CANVAS_WIDTH, 10) rgba (10,10,10,10);
    al ( awa , asd, asda, asd );
    hola = vector ( 10 , 10 );
    al = rgba ( MAX_RED , 12 ,MAX_BLUE ,0 );
    print ;
    fill al a1asd23;
    fill vector ( CANVAS_WIDTH , CANVAS_HEIGHT ) rgba (1010,10,10,MAX_ALPHA );

    if( ( id.x <= ise .r ) && (12 == 123 || (w3.y > 123)) ){
        fill vector ( CANVAS_WIDTH, 10) wwre;
        al ( awa , asd, asda, asd );
        hola = vector ( 10 , 10 );
        al = rgba ( MAX_RED , 12 ,MAX_BLUE ,0 );
        print ;
        fill al a1asd23;
        fill vector ( CANVAS_WIDTH , CANVAS_HEIGHT ) rgba (1010,10,10,MAX_ALPHA );
    }

    from rgba ( 10, 10, 10, 1 ) to rgba ( 10, 10, 10, 123) do {
        fill vector ( CANVAS_WIDTH, 10) wwre;
        al ( awa , asd, asda, asd );
        hola = vector ( 10 , 10 );
        al = rgba ( MAX_RED , 12 ,MAX_BLUE ,0 );
        print ;
        fill al a1asd23;
        fill vector ( CANVAS_WIDTH , CANVAS_HEIGHT ) rgba (1010,10,10,MAX_ALPHA );
    }

    from rgba( 10, 10, 10, 1 ) to vector ( CANVAS_WIDTH, CANVAS_HEIGHT ) do {
        fill vector ( CANVAS_WIDTH, 10) wwre;
        al ( awa , asd, asda, asd );
        hola = vector ( 10 , 10 );
        al = rgba ( MAX_RED , 12 ,MAX_BLUE ,0 );
        print ;
        fill al a1asd23;
        fill vector( CANVAS_WIDTH , CANVAS_HEIGHT ) rgba (1010,10,10,MAX_ALPHA );
    }
}

fun void main(){
    var v1: vector;
    var v2:  vector;
    v1 = vector ( 10, 10 );
    v2 = vector ( 30, 1203);
    aA ( v1 );
    aA ( v2 );
    var a123 : float;
    while( aver < 12 )
    {
        print;
        fill myVector asd;
    }
 
} 

"""

test_valid_2 = """
filename read "beexl.jpg";
var myVector: vector;

fun void main (){
    myVector = vector ( 10, 10);
    var al : vector;
    al =  (A + ( B * ( A - fdh ) ) ) - B;
    print;
    if ( A < B && B < A ) {
        print;
    }
    else {
        xd = A * B < ( A + B ) * C ;
    }
    while ( A == B || B < C ){
        print;
        fill myVector merg;
    }

    if ( ( A * B < C * A ) && ( A - B >= C + A || A < B ) )){
        print;
    }
}
"""




test_vbealid_3 = """
filename create "beexl.jpg";
canvas 10 , 10 ;
background rgba ( 10,12,14,12 ) ;

fun void main () {
    A = ( 1 - 2 ) * 3  / 4  / ( 5 * ( 6 * 7 ) / 8 );
}
"""



tests = [test_valid_3]

for test in tests:
    print("--------------")
    print("Test: ", tests.index(test) + 1)
    lexer = beexlLexer(InputStream(test))
    stream = CommonTokenStream(lexer)
    parser = beexlParser(stream)
    tree = parser.fileconfig0()
    listener = beexlListener()
    ParseTreeWalker().walk(listener,tree)
    #walker = ParseTreeWalker()
    #print(tree,"TREE")
    #walker.walk(printer,tree)
    #print(tree.toStringTree())