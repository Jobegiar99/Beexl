from PIL import Image,ImageShow

class BeexlHelper():

    def __init__(self):
        pass

    def createImage(self,iSize, bColor,name):
        self.canvas = Image.new(mode="RGBA",size = iSize,color = bColor)
        self.filename = name

    def readImage(self,name):
        self.canvas =  Image.open(name) 
        if self.canvas.mode != "RGBA":
                print("FILE MUST HAVE RGBA COLOR FORMAT")
                exit()
        self.filename = name

    def fill(self,position,color):
        self.canvas.putpixel(position,color)

    def printImage(self):
        self.saveImage()
        self.canvas.show(title=self.filename)

    def saveImage(self):
        self.canvas.save(self.filename)
    

beexlHelper = BeexlHelper()
beexlHelper.readImage("test.png")
for x in range(beexlHelper.canvas.width):
    for y in range(beexlHelper.canvas.height):
        beexlHelper.fill((x,y),(x,y,x,255))
beexlHelper.printImage()


    
