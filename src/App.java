import processing.core.*;

import classes.*;

public class App  extends PApplet{
   

    public static void main(String[] args) {
        String[] processingArgs = {"MySketch"};
		App mySketch = new App();
		PApplet.runSketch(processingArgs, mySketch);
    }

    brush bill;
    brush hvid;
    button bros;
    

    int brain = color(100, 150, 100);
    int bruh = color(255, 255, 255);


    public void settings(){
        size(1920, 1080);
        bill = new brush(9, brain, this);
        hvid = new brush(50, bruh, this);
        bros = new button(this,bruh, 25, 1050,50);
    }

   


    public void setup(){
        fill(255);
    rect(50, 50, 200, 200);
    
    }

    public void draw(){
        loadPixels();
    
        updatePixels();
        bros.drawButton();
    }

   public void mouseDragged() {
    if(mouseButton==LEFT){
        bill.setPixels();
    }  else{
        hvid.setPixels();  
    }
     
           
    }   
    
  
}

