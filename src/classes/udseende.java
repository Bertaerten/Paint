package classes;

import processing.core.PApplet;

public class Udseende {
PApplet p;
    
    public Udseende (PApplet s) {
        p = s;
    }
    
    public void indsætUdseende(){
        p.fill(41, 39, 37, 255);
        p.rect(0, 0, 1920, 210);
        p.fill(87,87,85,255);
        p.line(105,5,105,200);
        p.line(300,5,300,200);
        p.line(470,5,470,200);
        p.line(545,5,545,200);
        p.line(900,5,900,200);
        p.line(1000,5,1000,200);
        p.line(1500,5,1500,200);
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
    }
}
