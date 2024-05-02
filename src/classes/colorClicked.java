package classes;

import processing.core.PApplet;

public class colorClicked {
PApplet p;
int kind;

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
    
    public colorClicked (PApplet s) {
        p = s;
    }
    
    public void huskColorClicked(){

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
