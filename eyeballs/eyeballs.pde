void setup()
{  
  fill(0,0,0);
size(1000,1000);
  }
void draw()
{
   PImage face = loadImage("face.jpg");
image(face,-250,-50,1650,1000);
  
  fill(255,255,255);
  ellipse(400,400,200,200);
  ellipse(750,400,200,200);
  
  if (mouseX > 450)
  {
    mouseX=450;
  }
  if (mouseX<350)
  {
    mouseX=350;
  }
  if(mouseY> 450)
  {
    mouseY=450;
  }
  if(mouseY<350)
  {
    mouseY=350;
  }  
  fill(0,0,0);
  ellipse(mouseX,mouseY,50,50);
  ellipse(mouseX+350,mouseY,50,50);


}
  


