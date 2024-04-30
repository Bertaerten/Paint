import processing.core.*;

import classes.*;

public class App  extends PApplet{
   
boolean drag = false;

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
        bill = new brush(25, brain, this);
    }

   


    public void setup(){
        fill(255);
    rect(50, 50, 200, 200);
    
    }

    public void draw(){
        //background(255);
        
        loadPixels();
        
        if (drag){
            bill.setPixels(); 
        }
        
        

        updatePixels();

        
    }

   public void mouseDragged() {
            drag = true;
    }   

    public void mouseReleased(){
        drag = false;
    }
    
  
}

