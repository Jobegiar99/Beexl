from PIL import Image
from beexlSemantic import beexlSemantic

class BeexlHelper():

    def __init__(self):
        pass

    def createImage(self,iSize, bColor,name):
        self.canvas = Image.new(mode="RGBA",size = iSize,color = bColor)
        self.filename = name
        self.gif = []

    def readImage(self,name):
        try:
            self.canvas =  Image.open(name) 
            if self.canvas.mode != "RGBA":
                    beexlSemantic.stopExecution("FILE MUST HAVE RGBA COLOR FORMAT")
 
            self.filename = name
        except Exception as e:
            beexlSemantic.stopExecution("File with name: " + name + " not found")
            
    def fill(self,position,color):
        #print(position,color)
        self.canvas.putpixel(position,color)
        self.gif.append(self.canvas.copy())

    def printImage(self):
        self.canvas.show(title = self.filename)

    def saveImage(self):
        self.canvas.save(self.filename)

    def AnimateCanvas(self):
        if len(self.gif) == 0:
            beexlSemantic.stopExecution("To create a gif you must use fill at least once")
        gifName = self.filename.split('.')[0] + '.gif'
        self.gif[0].save(gifName, save_all=True,optimize=False, append_images=self.gif[1:], loop=0)
         
beexlHelper = BeexlHelper()