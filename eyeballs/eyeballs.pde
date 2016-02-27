void setup()
{  
  fill(0,0,0);
size(1000,1000);
  }
void draw()
{
  fill(255,255,255);
  
  ellipse(400,400,200,200);
  ellipse(750,400,200,200);
  fill(0,0,0);
  ellipse(mouseX,mouseY,50,50);
  ellipse(mouseX+350,mouseY,50,50);

  
}  

