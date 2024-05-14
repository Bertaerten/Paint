import processing.core.*;
import classes.*;

public class App  extends PApplet{
   

    public static void main(String[] args) {
        PApplet.main("App");
    }
    Udseende indsæt;

    Button[] colorButton = new Button [15];

    Button[] otherKnaps = new Button [15];
    

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

    int kind = 1;

    char tool = 'l';

    Brush bill;
    Brush bernie;
    Bucket brian;
    Eyedrop barry;
    

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

    bill = new Brush(20, hvid, 0.2f, this);
    bernie = new Brush(20, hvid, 0.2f, this);
    brian = new Bucket(this, hvid);
    barry = new Eyedrop(this);
        
        


        farve1Stor = new Button(this, sort, 50, 1050, 50);
        farve2Stor = new Button(this, hvid, 50, 1050, 140);

        otherKnaps[0] = new Button (this, sort, 30, 600, 80);
        otherKnaps[1] = new Button (this, hvid, 30, 660, 80);
        otherKnaps[2] = new Button (this, hvid, 30, 720, 80);
        otherKnaps[3] = new Button (this, hvid, 30, 780, 80);
        otherKnaps[4] = new Button (this, hvid, 30, 840, 80);

        otherKnaps[5] = new Button (this, sort, 30, 600, 170);
        otherKnaps[6] = new Button (this, hvid, 30, 660, 170);
        otherKnaps[7] = new Button (this, hvid, 30, 720, 170);
        otherKnaps[8] = new Button (this, hvid, 30, 780, 170);
        otherKnaps[9] = new Button (this, hvid, 30, 840, 170);

        otherKnaps[10] = new Button (this, sort, 90, 55, 130);
        otherKnaps[11] = new Button (this, hvid, 90, 165, 130);
        otherKnaps[12] = new Button (this, hvid, 90, 275, 130);
        otherKnaps[13] = new Button (this, hvid, 90, 385, 130);
        otherKnaps[14] = new Button (this, hvid, 90, 495, 130);



        colorButton[2] = new Button(this, sort, 30, 1110, 50);
        colorButton[3] = new Button(this, hvid, 30, 1110, 100);
        colorButton[4] = new Button(this, sand, 30, 1110, 150);
        colorButton[5] = new Button(this, grøn, 30, 1160, 50);
        colorButton[6] = new Button(this, blå, 30, 1160, 100);
        colorButton[7] = new Button(this, grå, 30, 1160, 150);
        colorButton[8] = new Button(this, pink, 30, 1210, 50);
        colorButton[9] = new Button(this, lilla, 30, 1210, 100);
        colorButton[10] = new Button(this, hvidGul, 30, 1210, 150);
        colorButton[11] = new Button(this, blåSort, 30, 1260, 50);
        colorButton[12] = new Button(this, lillaV2, 30, 1260, 100);
        colorButton[13] = new Button(this, måskeRød, 30, 1260, 150);
        colorButton[14] = new Button(this, hotPink, 30, 1310, 50);
        colorButton[0] = new Button(this, gul, 30, 1310, 100);
        colorButton[1] = new Button(this, grøn2, 30, 1310, 150);

    }

    public void draw() {

        if (mouseY < Udseende.minY) {
            colorClicked();

            // UI del________________
            farve1Stor.drawButton();
            farve2Stor.drawButton();

            for (int i = 0; i < colorButton.length; i++) {
                colorButton[i].drawButton();
            }
            for (int i = 0; i < otherKnaps.length; i++) {
                otherKnaps[i].drawButton();
            }
        } else {
            BrushSwitch();
        }
    }

void BrushSwitch(){

    if (mousePressed) {

        switch (tool) {
            case 'l':
                if (mouseButton == LEFT) {
                    bill.lineDraw();
                } else if (mouseButton == RIGHT) {
                    bernie.lineDraw();
                }
                break;

            case 'p':
                if (mouseButton == LEFT) {
                    bill.setPixels();
                } else if (mouseButton == RIGHT) {
                    bernie.setPixels();
                }
                break;

            case 's':
                if (mouseButton == LEFT) {
                    bill.spray();
                } else if (mouseButton == RIGHT) {
                    bernie.spray();
                }
                break;

            case 'e':
                if (mouseButton == LEFT) {
                    farve1Stor.setColor(barry.getColor());
                    farve1Stor.drawButton();
                } else if (mouseButton == RIGHT) {
                    farve2Stor.setColor(barry.getColor());
                    farve2Stor.drawButton();
                }
                break;

            case 'b':
                brian.fill(barry.getColor());
                break;
        }
    }
}


 public void colorClicked() {
     if (farve1Stor.isClicked()) {
         kind = 1;
         
     } else if (farve2Stor.isClicked()) {
         kind = 2;

     }

     for (int i = 0; i < colorButton.length; i++) {
         if (kind == 1) {
             if (colorButton[i].isClicked()) {
                 farve1Stor.setColor(colorButton[i].getColor());
             }
         }
         if (kind == 2) {
             if (colorButton[i].isClicked()) {
                 farve2Stor.setColor(colorButton[i].getColor());
             }
         }
     }

     for (int i = 0; i < otherKnaps.length; i++) {
         if (otherKnaps[i].isClicked()) {
             if (i < 5) {
                 bill.setSize((1 + i) * 20);
                 bernie.setSize((1 + i) * 20);


                 otherKnaps[i].setColor(sort);
                 for (int j = 0; j < 5; j++) {
                     if (j != i)
                         otherKnaps[j].setColor(hvid);
                 }
             } else if (i >= 5 && i < 10) {
                 bill.setHard((i - 4) * 0.2f);
                 bernie.setHard((i - 4) * 0.2f);


                 otherKnaps[i].setColor(sort);
                 for (int j = 5; j < 10; j++) {
                     if (j != i)
                         otherKnaps[j].setColor(hvid);
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
              otherKnaps[i].setColor(sort);
                 for (int j = 10; j < otherKnaps.length; j++) {
                     if (j != i)
                         otherKnaps[j].setColor(hvid);
                 }
             }
         }
     }

     bill.setColor(farve1Stor.getColor());
     bernie.setColor(farve2Stor.getColor());
     brian.setNewColor(farve1Stor.getColor());
 }
}