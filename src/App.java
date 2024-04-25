import processing.core.*;

import classes.*;

public class App  extends PApplet{
   

    public static void main(String[] args) {
        String[] processingArgs = {"MySketch"};
		App mySketch = new App();
		PApplet.runSketch(processingArgs, mySketch);
    }

    brush bill;
    brush eraser;

    int brain = color(100, 150, 100);

    public void settings(){
        size(600, 400);
        bill = new brush(9, brain, this);
    }

   


    public void setup(){
        fill(255);
    rect(50, 50, 200, 200);
    
    }

    public void draw(){
        loadPixels();
    
        updatePixels();
    }

   public void mouseDragged() {
        bill.setPixels();      
    }   
    
  
}

