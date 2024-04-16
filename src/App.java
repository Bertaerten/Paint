import processing.core.*;

import classes.*;

public class App  extends PApplet{
   

    public static void main(String[] args) {
        String[] processingArgs = {"MySketch"};
		App mySketch = new App();
		PApplet.runSketch(processingArgs, mySketch);
    }

    public void settings(){
        size(600, 400);
    }

    public void setup(){
        fill(255);
    rect(50, 50, 200, 200);
    
    }

    public void draw(){
        loadPixels();
    
        updatePixels();
    }

   public void mouseDragged() 
{
    if(mouseX<250 && mouseX>50){
        if(mouseY<250 && mouseY>50)
        set(mouseX, mouseY, color(0));
    }   
    
  }
}

