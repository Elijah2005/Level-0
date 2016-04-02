 
 import ddf.minim.*;
 AudioSample sound;
 void setup(){ 
   Minim minim = new Minim (this);
//sound = minim.loadSample("test.wav");
 //uf.wav
   
 size(1000,1000);
    fill(0,0,250);
  ellipse(500,500,500,500);
 
 fill(250,0,0);
ellipse(500,500,450,450);
fill(0,250,0);
ellipse(500,500,400,400);
 
 }
 
 void draw()
 {

PImage kitten = loadImage ("kitten.ppm.gif");
kitten.resize(100,100);
image(kitten,500,500);
if(mousePressed)
 {
   image(kitten,mouseX,mouseY);
   sound.trigger();
 }
 }
