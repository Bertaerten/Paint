import processing.core.*;

import classes.*;

public class App  extends PApplet{
   

    public static void main(String[] args) {
        String[] processingArgs = {"MySketch"};
		App mySketch = new App();
		PApplet.runSketch(processingArgs, mySketch);
    }

    public void settings(){
        size(1920, 1080);
    }

    public void setup(){
    }

    public void draw(){
       int størrelseStor = 50
       int størrelseLille = 
       int radiusStor = 25;
       int radiusLille = 15;

       int sort = color(0,0,0,255);
       

       // start interface
        fill(41, 39, 37, 255);
        rect(0, 0, 1920, 210);
        fill(87,87,85,255);
        line(105,5,105,200);
        line(300,5,300,200);
        line(470,5,470,200);
        line(545,5,545,200);
        line(900,5,900,200);
        line(1000,5,1000,200);
        line(1500,5,1500,200);

        //husk at brug int (farve)=color(rgb) 
        fill(sort);//bare pt
        stroke(87,87,85,255);
        circle(1050, 50, 50); //disse skal laves om til variable der starter med disse farver
        if (mouseX>1025 && mouseX<1075 && mouseY>25 && mouseY<75){
        //start sort
        fill(179,182,183, 150);
        circle(1050, 50, 55);
        }

        //Start hvid
        fill(255,255,255,255);
        stroke(87,87,85,255);
        circle(1050, 140, 50); //disse skal laves om til variable der starter med disse farver
        if (mouseX>1025 && mouseX<1075 && mouseY>115 && mouseY<165){
            //start sort
            fill(179,182,183, 150);
            circle(1050, 140, 55);
            }
        
        //kommende cirkler er konstante farver der skal ændre på de variable farver
        //sort
        fill(sort);
        stroke(87,87,85,255);
        circle(1110, 50, 30);
        if (mouseX>1095 && mouseX<1125 && mouseY>35 && mouseY<65){
            //start sort
            fill(179,182,183, 150);
            circle(1110, 50, 35);
            }

        //hvid
        fill(255,255,255,255);
        stroke(87,87,85,255);
        circle(1110, 100, 30);

        //sand
        fill(160,160,30,255);
        stroke(87,87,85,255);
        circle(1110, 150, 30);

        //grøn
        fill(186,208,7,255);
        stroke(87,87,85,255);
        circle(1160, 50, 30);

        //blå
        fill(90,209,173,255);
        stroke(87,87,85,255);
        circle(1160, 100, 30);

        //grå
        fill(186,209,173,255);
        stroke(87,87,85,255);
        circle(1160, 150, 30);

        //pink
        fill(240,12,131,255);
        stroke(87,87,85,255);
        circle(1210, 50, 30);

        //lilla
        fill(128,14,237,255);
        stroke(87,87,85,255);
        circle(1210, 100, 30);

        //hvid gul
        fill(223,213,185,255);
        stroke(87,87,85,255);
        circle(1210, 150, 30); 

        //blå-sort
        fill(18,36,35,255);
        stroke(87,87,85,255);
        circle(1260, 50, 30);

        //LillaV2
        fill(71,25,59,255);
        stroke(87,87,85,255);
        circle(1260, 100, 30);

        //rød?
        fill(103,45,45,255);
        stroke(87,87,85,255);
        circle(1260, 150, 30);

        //hot pink
        fill(255,0,255,255);
        stroke(87,87,85,255);
        circle(1310, 50, 30);

        //gul
        fill(255,255,0,255);
        stroke(87,87,85,255);
        circle(1310, 100, 30);

        //grøn
        fill(0,255,0,255);
        stroke(87,87,85,255);
        circle(1310, 150, 30);
        

        
        //lav method i app
        
    }

    
}
