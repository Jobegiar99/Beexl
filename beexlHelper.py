from PIL import Image,ImageShow
from mySemantic import beexlSemantic
class BeexlHelper():

    def __init__(self):
        pass

    def createImage(self,iSize, bColor,name):
        self.canvas = Image.new(mode="RGBA",size = iSize,color = bColor)
        self.filename = name

    def readImage(self,name):
        try:
            self.canvas =  Image.open(name) 
            if self.canvas.mode != "RGBA":
                    beexlSemantic.stopExecution("FILE MUST HAVE RGBA COLOR FORMAT")
 
            self.filename = name
        except Exception as e:
            beexlSemantic.stopExecution("File with name: " + name + " not found")
            
    def fill(self,position,color):
        self.canvas.putpixel(position,color)

    def printImage(self):
        self.saveImage()
        self.canvas.show(title=self.filename)

    def saveImage(self):
        self.canvas.save(self.filename)
    
beexlHelper = BeexlHelper()