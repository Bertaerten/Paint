import processing.core.*;
import classes.*;

public class App  extends PApplet{
   

    public static void main(String[] args) {
        PApplet.main("App");
    }
    Udseende indsæt;

    Button[] colorbuttons = new Button [15];

    Button[] otherButtons = new Button [15];
    

    Button farve1Stor;//skal ændres senere
    Button farve2Stor;//skal ændres senere

    int sort = color(0,0,0,255);
    int hvid = color(255,255,255,255); 
    int sand = color(160,160,30,255);
    int grøn = color(186,208,7,255);
    int blå = color (90,209,173,255);
    int grå = color(186,209,173,255);
    int pink = color(240,12,131,255);
    int lilla = color(128,14,237,255);
    int hvidGul = color(223,213,185,255);
    int blåSort = color(18,36,35,255);
    int lillaV2 = color(71,25,59,255);
    int måskeRød = color(103,45,45,255);
    int hotPink = color(255,0,255,255);
    int gul = color(255,255,0,255);
    int grøn2 = color(0,255,0,255);

    int lastButton= 1;

    char tool = 'l';

    Brush brush1;
    Brush brush2;
    Bucket bucket;
    Eyedrop eyedopper;
    

    public void settings(){
        fullScreen(P2D);
        smooth(4);
    }

    public void setup(){
        fill(255);
    rect(0, 200, 1920, 1880);
    surface.setLocation(0,0);
    

    indsæt = new Udseende(this);
    indsæt.indsætUdseende();

    brush1 = new Brush(20, hvid, 0.2f, this);
    brush2 = new Brush(20, hvid, 0.2f, this);
    bucket = new Bucket(this, hvid);
    eyedopper = new Eyedrop(this);
        
        


        farve1Stor = new Button(this, sort, 50, 1050, 50);
        farve2Stor = new Button(this, hvid, 50, 1050, 140);

        otherButtons[0] = new Button (this, sort, 30, 600, 80);
        otherButtons[1] = new Button (this, hvid, 30, 660, 80);
        otherButtons[2] = new Button (this, hvid, 30, 720, 80);
        otherButtons[3] = new Button (this, hvid, 30, 780, 80);
        otherButtons[4] = new Button (this, hvid, 30, 840, 80);

        otherButtons[5] = new Button (this, sort, 30, 600, 170);
        otherButtons[6] = new Button (this, hvid, 30, 660, 170);
        otherButtons[7] = new Button (this, hvid, 30, 720, 170);
        otherButtons[8] = new Button (this, hvid, 30, 780, 170);
        otherButtons[9] = new Button (this, hvid, 30, 840, 170);

        otherButtons[10] = new Button (this, sort, 90, 55, 130);
        otherButtons[11] = new Button (this, hvid, 90, 165, 130);
        otherButtons[12] = new Button (this, hvid, 90, 275, 130);
        otherButtons[13] = new Button (this, hvid, 90, 385, 130);
        otherButtons[14] = new Button (this, hvid, 90, 495, 130);



        colorbuttons[2] = new Button(this, sort, 30, 1110, 50);
        colorbuttons[3] = new Button(this, hvid, 30, 1110, 100);
        colorbuttons[4] = new Button(this, sand, 30, 1110, 150);
        colorbuttons[5] = new Button(this, grøn, 30, 1160, 50);
        colorbuttons[6] = new Button(this, blå, 30, 1160, 100);
        colorbuttons[7] = new Button(this, grå, 30, 1160, 150);
        colorbuttons[8] = new Button(this, pink, 30, 1210, 50);
        colorbuttons[9] = new Button(this, lilla, 30, 1210, 100);
        colorbuttons[10] = new Button(this, hvidGul, 30, 1210, 150);
        colorbuttons[11] = new Button(this, blåSort, 30, 1260, 50);
        colorbuttons[12] = new Button(this, lillaV2, 30, 1260, 100);
        colorbuttons[13] = new Button(this, måskeRød, 30, 1260, 150);
        colorbuttons[14] = new Button(this, hotPink, 30, 1310, 50);
        colorbuttons[0] = new Button(this, gul, 30, 1310, 100);
        colorbuttons[1] = new Button(this, grøn2, 30, 1310, 150);

    }

    public void draw() {

        if (mouseY < Udseende.minY) {
            buttonUpdate();

            // UI del________________
            farve1Stor.drawButton();
            farve2Stor.drawButton();

            for (int i = 0; i < colorbuttons.length; i++) {
                colorbuttons[i].drawButton();
            }
            for (int i = 0; i < otherButtons.length; i++) {
                otherButtons[i].drawButton();
            }
        } else {
            brushDraw();
        }
    }

void brushDraw(){

    if (mousePressed) {

        switch (tool) {
            case 'l':
                if (mouseButton == LEFT) {
                    brush1.lineDraw();
                } else if (mouseButton == RIGHT) {
                    brush2.lineDraw();
                }
                break;

            case 'p':
                if (mouseButton == LEFT) {
                    brush1.setPixels();
                } else if (mouseButton == RIGHT) {
                    brush2.setPixels();
                }
                break;

            case 's':
                if (mouseButton == LEFT) {
                    brush1.spray();
                } else if (mouseButton == RIGHT) {
                    brush2.spray();
                }
                break;

            case 'e':
                if (mouseButton == LEFT) {
                    farve1Stor.setColor(eyedopper.getColor());
                    farve1Stor.drawButton();
                } else if (mouseButton == RIGHT) {
                    farve2Stor.setColor(eyedopper.getColor());
                    farve2Stor.drawButton();
                }
                break;

            case 'b':
                bucket.fill(eyedopper.getColor());
                break;
        }
    }
}


 public void buttonUpdate() {
     if (farve1Stor.isClicked()) {
         lastButton= 1; 
     } else if (farve2Stor.isClicked()) {
         lastButton= 2;
     }

     for (int i = 0; i < colorbuttons.length; i++) {
         if (lastButton== 1) {
             if (colorbuttons[i].isClicked()) {
                 farve1Stor.setColor(colorbuttons[i].getColor());
             }
         }
         if (lastButton== 2) {
             if (colorbuttons[i].isClicked()) {
                 farve2Stor.setColor(colorbuttons[i].getColor());
             }
         }
     }

     for (int i = 0; i < otherButtons.length; i++) {
         if (otherButtons[i].isClicked()) {
             if (i < 5) {
                 brush1.setSize((1 + i) * 20);
                 brush2.setSize((1 + i) * 20);


                 otherButtons[i].setColor(sort);
                 for (int j = 0; j < 5; j++) {
                     if (j != i)
                         otherButtons[j].setColor(hvid);
                 }
             } else if (i >= 5 && i < 10) {
                 brush1.setHard((i - 4) * 0.2f);
                 brush2.setHard((i - 4) * 0.2f);


                 otherButtons[i].setColor(sort);
                 for (int j = 5; j < 10; j++) {
                     if (j != i)
                         otherButtons[j].setColor(hvid);
                 }
             } else if (i >= 10) {

              if (i==10){
                tool = 'l';
              }
              else if (i==11) {
                tool = 'p';
              }
              else if (i==12) {
                tool = 's';
              }
              else if (i==13) {
                tool = 'e';
              }
              else if (i==14) {
                tool = 'b';
              }
              otherButtons[i].setColor(sort);
                 for (int j = 10; j < otherButtons.length; j++) {
                     if (j != i)
                         otherButtons[j].setColor(hvid);
                 }
             }
         }
     }

     brush1.setColor(farve1Stor.getColor());
     brush2.setColor(farve2Stor.getColor());
     bucket.setNewColor(farve1Stor.getColor());
 }
}