import processing.core.*;

import classes.*;

public class App  extends PApplet{
   

    public static void main(String[] args) {
        PApplet.main("App");
    }
    Udseende indsæt;

    Button[] colorButton = new Button [15];

    Button[] otherKnaps = new Button [10];
    

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

    Brush bill;
    Brush eraser;
    Button bros;
    

    int brain = color(100, 150, 100);
    int white = color(255, 255, 255, 255);
    int bruh = color(255, 255, 255);


    public void settings(){
        size(1920, 1080);
    }

   


    public void setup(){
        fill(255);
    rect(0, 200, 1920, 1880);
    surface.setLocation(0,0);

    indsæt = new Udseende(this);
    indsæt.indsætUdseende();

    bill = new Brush(20, brain, 0.6f, this);
    eraser = new Brush(30, white, 0.8f, this);
        
        


        farve1Stor = new Button(this, sort, 50, 1050, 50);
        farve2Stor = new Button(this, hvid, 50, 1050, 140);

        otherKnaps[0] = new Button (this, hvid, 30, 600, 80);
        otherKnaps[1] = new Button (this, hvid, 30, 660, 80);
        otherKnaps[2] = new Button (this, hvid, 30, 720, 80);
        otherKnaps[3] = new Button (this, hvid, 30, 780, 80);
        otherKnaps[4] = new Button (this, hvid, 30, 840, 80);

        otherKnaps[5] = new Button (this, hvid, 30, 600, 170);
        otherKnaps[6] = new Button (this, hvid, 30, 660, 170);
        otherKnaps[7] = new Button (this, hvid, 30, 720, 170);
        otherKnaps[8] = new Button (this, hvid, 30, 780, 170);
        otherKnaps[9] = new Button (this, hvid, 30, 840, 170);



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

   




    public void draw(){


if (mouseY<200){
        colorClicked();
        
        // UI del________________
        farve1Stor.drawButton();
        farve2Stor.drawButton();

        for (int i=0; i<colorButton.length;i++) {
            colorButton[i].drawButton();
        }
        for (int i=0; i<otherKnaps.length;i++) {
            otherKnaps[i].drawButton();
        }
    }
else{
    if(mousePressed){
        if(mouseButton==LEFT){
            bill.setPixels();
        }else if (mouseButton == RIGHT){
            eraser.setPixels();
        }
    }
}
 }

public void colorClicked(){
    if (farve1Stor.isClicked()){
        kind = 1;
      }
      else if (farve2Stor.isClicked()){
        kind = 2;
      }

      for(int i=0; i<colorButton.length ; i++){
        if (kind == 1){
          if(colorButton[i].isClicked()){
            farve1Stor.setColor(colorButton[i].getColor());
    }
   }
        if (kind == 2){
          if(colorButton[i].isClicked()){
            farve2Stor.setColor(colorButton[i].getColor());
    }
   }
  }

  for (int i=0; i<otherKnaps.length; i++){
    if (otherKnaps[i].isClicked())
    if (i<5){
     bill.setSize((1+i)*20);
    }
    if (i>5){
      bill.setSize((1+i)*20);
     }
  }

 /* if (otherKnaps[0].isClicked()){
    bill.changeSize(3);
  }

  if (otherKnaps[1].isClicked()){
    if ((bill.getSize()-3) > 3){
        bill.changeSize(-3);
    }
  }

  if (otherKnaps[2].isClicked()){
    if ((bill.getHard()+0.1f)<1f){
        bill.changeHard(0.1f);
    }
  }
  
  if (otherKnaps[3].isClicked()){

    }*/
  //}
  bill.setColor(farve1Stor.getColor());
  eraser.setColor(farve2Stor.getColor());
 }
}