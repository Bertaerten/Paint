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
    int white = color(255, 255, 255, 255);

    public void settings(){
        size(600, 400);
        bill = new brush(20, brain, 0.6f, this);
        eraser = new brush(30, white, 0.8f, this);
    }

   


    public void setup(){
        fill(255);
    rect(50, 50, 200, 200);
    
    }

    public void draw(){
        //System.out.println(drag);
        
        if (mousePressed){
            if(mouseButton == LEFT){
                bill.setPixels();
            }
            else if(mouseButton == RIGHT){
                eraser.setPixels();
            }
            
            
        }

        

        
    }

    
  
}

