import processing.core.*;

import classes.*;

public class App  extends PApplet{
   

    public static void main(String[] args) {
        PApplet.main("App");
    }
    udseende indsæt;

    button farve1Stor;//skal ændres senere
    button farve2Stor;//skal ændres senere


    button sortCirkel; //konstant
    button hvidCirkel; //konstant
    button sandCirkel; //konstant
    button grønCirkel; //konstant
    button blåCirkel; //konstant
    button gråCirkel; //konstant
    button pinkCirkel; //konstant
    button lillaCirkel; //konstant
    button hvidGulCirkel; //konstant
    button blåSortCirkel; //konstant
    button lillaV2Cirkel; //konstant
    button måskeRødCirkel; //konstant
    button hotPinkCirkel; //konstant
    button gulCirkel; //konstant
    button grøn2Cirkel; //konstant

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

    int kind;

    brush bill;
    brush hvid1;
    button bros;
    

    int brain = color(100, 150, 100);
    int bruh = color(255, 255, 255);


    public void settings(){
        size(1920, 1080, P2D);
        indsæt = new udseende(this);

        


        farve1Stor = new button(this, sort, 50, 1050, 50);
        farve2Stor = new button(this, hvid, 50, 1050, 140);


        sortCirkel = new button(this, sort, 30, 1110, 50);
        hvidCirkel = new button(this, hvid, 30, 1110, 100);
        sandCirkel = new button(this, sand, 30, 1110, 150);
        grønCirkel = new button(this, grøn, 30, 1160, 50);
        blåCirkel = new button(this, blå, 30, 1160, 100);
        gråCirkel = new button(this, grå, 30, 1160, 150);
        pinkCirkel = new button(this, pink, 30, 1210, 50);
        lillaCirkel = new button(this, lilla, 30, 1210, 100);
        hvidGulCirkel = new button(this, hvidGul, 30, 1210, 150);
        blåSortCirkel = new button(this, blåSort, 30, 1260, 50);
        lillaV2Cirkel = new button(this, lillaV2, 30, 1260, 100);
        måskeRødCirkel = new button(this, måskeRød, 30, 1260, 150);
        hotPinkCirkel = new button(this, hotPink, 30, 1310, 50);
        gulCirkel = new button(this, gul, 30, 1310, 100);
        grøn2Cirkel = new button(this, grøn2, 30, 1310, 150);

    }

   


    public void setup(){
        fill(255);
    rect(0, 200, 1920, 1880);
    surface.setLocation(0,0);
    
    }

    public void draw(){
        loadPixels();
    
        updatePixels();

        colorClicked();

        indsæt.indsætUdseende();




        farve1Stor.drawButton();
        farve2Stor.drawButton();

        sortCirkel.drawButton();
        hvidCirkel.drawButton();
        sandCirkel.drawButton();
        grønCirkel.drawButton();
        blåCirkel.drawButton();
        gråCirkel.drawButton();
        pinkCirkel.drawButton();
        lillaCirkel.drawButton();
        hvidGulCirkel.drawButton();
        blåSortCirkel.drawButton();
        lillaV2Cirkel.drawButton();
        måskeRødCirkel.drawButton();
        hotPinkCirkel.drawButton();
        gulCirkel.drawButton();
        grøn2Cirkel.drawButton();

    }

   public void mouseDragged() 
{
    if(mouseX<1920 && mouseX>0){
        if(mouseY<1080 && mouseY>200)
        set(mouseX, mouseY, color(0));
    }   
 }

public void colorClicked(){
    if (farve1Stor.isClicked()){
        kind = 1;
      }
      else if (farve2Stor.isClicked()){
        kind = 2;
      }

  if (kind == 1){
      if(sortCirkel.isClicked()){
          farve1Stor.setColor(sortCirkel.getColor());
      }
      if(hvidCirkel.isClicked()){
          farve1Stor.setColor(hvidCirkel.getColor());
      }
      if(sandCirkel.isClicked()){
          farve1Stor.setColor(sandCirkel.getColor());
      }
      if(grønCirkel.isClicked()){
          farve1Stor.setColor(grønCirkel.getColor());
      }
      if(blåCirkel.isClicked()){
          farve1Stor.setColor(blåCirkel.getColor());
      }
      if(gråCirkel.isClicked()){
          farve1Stor.setColor(gråCirkel.getColor());
      }
      if(pinkCirkel.isClicked()){
          farve1Stor.setColor(pinkCirkel.getColor());
      }
      if(lillaCirkel.isClicked()){
          farve1Stor.setColor(lillaCirkel.getColor());
      }
      if(hvidGulCirkel.isClicked()){
          farve1Stor.setColor(hvidGulCirkel.getColor());
      }
      if(blåSortCirkel.isClicked()){
          farve1Stor.setColor(blåSortCirkel.getColor());
      }
      if(lillaV2Cirkel.isClicked()){
          farve1Stor.setColor(lillaV2Cirkel.getColor());
      }
      if(måskeRødCirkel.isClicked()){
          farve1Stor.setColor(måskeRødCirkel.getColor());
      }
      if(hotPinkCirkel.isClicked()){
          farve1Stor.setColor(hotPinkCirkel.getColor());
      }
      if(gulCirkel.isClicked()){
          farve1Stor.setColor(gulCirkel.getColor());
      }
      if(grøn2Cirkel.isClicked()){
          farve1Stor.setColor(grøn2Cirkel.getColor());
      }
  }


  if (kind == 2){
      if(sortCirkel.isClicked()){
          farve2Stor.setColor(sortCirkel.getColor());
      }
      if(hvidCirkel.isClicked()){
          farve2Stor.setColor(hvidCirkel.getColor());
      }
      if(sandCirkel.isClicked()){
          farve2Stor.setColor(sandCirkel.getColor());
      }
      if(grønCirkel.isClicked()){
          farve2Stor.setColor(grønCirkel.getColor());
      }
      if(blåCirkel.isClicked()){
          farve2Stor.setColor(blåCirkel.getColor());
      }
      if(gråCirkel.isClicked()){
          farve2Stor.setColor(gråCirkel.getColor());
      }
      if(pinkCirkel.isClicked()){
          farve2Stor.setColor(pinkCirkel.getColor());
      }
      if(lillaCirkel.isClicked()){
          farve2Stor.setColor(lillaCirkel.getColor());
      }
      if(hvidGulCirkel.isClicked()){
          farve2Stor.setColor(hvidGulCirkel.getColor());
      }
      if(blåSortCirkel.isClicked()){
          farve2Stor.setColor(blåSortCirkel.getColor());
      }
      if(lillaV2Cirkel.isClicked()){
          farve2Stor.setColor(lillaV2Cirkel.getColor());
      }
      if(måskeRødCirkel.isClicked()){
          farve2Stor.setColor(måskeRødCirkel.getColor());
      }
      if(hotPinkCirkel.isClicked()){
          farve2Stor.setColor(hotPinkCirkel.getColor());
      }
      if(gulCirkel.isClicked()){
          farve2Stor.setColor(gulCirkel.getColor());
      }
      if(grøn2Cirkel.isClicked()){
          farve2Stor.setColor(grøn2Cirkel.getColor());
      }
  }
}

}
