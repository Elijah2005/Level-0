void setup()
{
  size(1024,640);
 
}
void draw()
{
  PImage face = loadImage("face.png");
image(face, 0, 0);
fill(mouseX,mouseY,255);
ellipse(225,265,125,125);
ellipse(460,265,131,131);
fill(0,0,0);
ellipse(225,265,62,62);
ellipse(460,265,65,65);



}

