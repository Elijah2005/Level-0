//1. Make a variable to hold the X co-ordinate of the dot, and set it to something.
int e =250;

void setup() {
  size(2000,2000);
}

void draw() {
  //3. make it a nice color
 fill(250,0,250);
  //4. if the mouse is pressed...
if(mousePressed)
{
e= e +100;
}
//5. ... change the X co-ordinate so that the dot moves to the right
      
  //2. Draw an ellipse of height and width 100. Make sure to use your variable for the X position.
ellipse(e,250,100,100);
//6. Make your dot move really fast so that it can win the race (you have to figure out what part of your code to change)

//7. Use this method to play a ding when your dot crosses the finish line. 
if(e==2000)
playSound();

}

import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
  if (!soundPlayed) {// Copyright Wintriss Technical Schools 2013
    Minim minim = new Minim(this);        
    AudioSample sound = minim.loadSample("ding.wav");
    sound.trigger();
    soundPlayed = true;
  }
}

