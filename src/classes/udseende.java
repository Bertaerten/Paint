package classes;

import processing.core.PApplet;

public class Udseende {
PApplet p;
public static final int minY=200;
public static final int maksY=1080;
public static final int minX=0;
public static final int maksX=1920; 
    
    public Udseende (PApplet s) {
        p = s;
    }
    
    public void indsætUdseende(){
        p.fill(41, 39, 37, 255);
        p.rect(0, 0, maksX, minY);
        p.fill(87,87,85,255);
        p.line(550,5,550,minY);
        p.line(900,5,900,minY);
        p.line(1000,5,1000,minY);
        p.line(1500,5,1500,minY);
        p.fill(255,255,255,255);
        p.textSize(20);
        p.text("Brush Gyatness", 650, 25);
        p.text("Brush Hardness", 650, 120);
        p.textSize(20);
        p.text("1", 595, 55);
        p.text("2", 655, 55);
        p.text("3", 715, 55);
        p.text("4", 775, 55);
        p.text("5", 835, 55);
        p.text("1", 595, 145);
        p.text("2", 655, 145);
        p.text("3", 715, 145);
        p.text("4", 775, 145);
        p.text("5", 835, 145);
        p.textSize(30);
        p.text("linje", 30, 70);
        p.text("pixel", 130, 70);
        p.text("spray", 235, 70);
        p.text("eyedrop", 330, 70);
        p.text("bucket", 450, 70);
    }
}
