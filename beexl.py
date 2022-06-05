from email.policy import default
from antlr4 import *
from numpy import array
from beexlLexer import beexlLexer
from beexlListener import beexlListener
from beexlParser import beexlParser
from collections import defaultdict
from beexlSemantic import *
from VirtualMachine import VirtualMachine, virtualMachine
from beexelErrorListener import BeexlErrorListener

filename = input()
test = ""
with open(filename,'r') as file:
    test =file.readlines()

lexer = beexlLexer(InputStream('\n'.join(test)))
stream = CommonTokenStream(lexer)
parser = beexlParser(stream)
parser.addErrorListener(BeexlErrorListener())
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
