package classes;

import processing.core.*;

public class Button {
    
PApplet p;
int radius;
int color;
int x;
int y;

public Button(PApplet s, int colorIn, int radiusIn, int xIn, int yIn){

    radius = radiusIn;
    color = colorIn;
    x = xIn;
    y = yIn;
    p = s;


}

public void drawButton(){
    p.fill(color);
    p.stroke(87,87,85,255);
    p.circle(x, y, radius); 

 if (p.mouseX>x-(radius/2) && p.mouseX<x+(radius/2) && p.mouseY>y-(radius/2) && p.mouseY<y+(radius/2)){

 p.fill(179,182,183,150);
 p.circle(x, y, radius+5);
 }
 else{
    p.fill(41, 39, 37, 255); 
    p.circle(x, y, radius+5);
    p.fill(color);
    p.stroke(87,87,85,255);
    p.circle(x, y, radius);
 }
}

public void setColor(int newColor){
    color = newColor;
}

public int getColor(){
  return color;
}

public boolean isClicked(){
 if (p.mousePressed == true){
  if (p.mouseX>x-(radius/2) && p.mouseX<x+(radius/2) && p.mouseY>y-(radius/2) && p.mouseY<y+(radius/2)){
    p.fill(0, 0, 0, 255);
    p.circle(x, y, radius+5);
    return true;
 }
 }
 return false;
 }
}


