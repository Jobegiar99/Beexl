from tracemalloc import start
from antlr4.error.ErrorListener import ErrorListener

class BeexlErrorListener( ErrorListener ):
    """
    
    This class is overwriting the ErrorListener to create a custom
    error listener used by Antlr4 Parser.
    
    """
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        print (str(line) + ":" + str(column) + ": sintax ERROR, " + str(msg))
        exit()

