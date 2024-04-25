package classes;
import java.applet.Applet;

import processing.core.*;


public class button {
    
PApplet p;
int radius;
int color;
int x;
int y;


public button(PApplet s, int ColorIn, int radiusIn, int xIn, int yIn){
    p=s;
    radius = radiusIn;
    color = ColorIn;
    x = xIn;
    y = yIn;

    /*// start interface
     fill(41, 39, 37, 255);
     rect(0, 0, 1920, 210);
     fill(87,87,85,255);
     line(105,5,105,200);
     line(300,5,300,200);
     line(470,5,470,200);
     line(545,5,545,200);
     line(900,5,900,200);
     line(1000,5,1000,200);
     line(1500,5,1500,200);*/
}
public void drawButton(){
 p.circle(x, y, radius);


 p.fill(color);//bare pt
 p.stroke(87,87,85,255);

 p.circle(x, y, radius); //disse skal laves om til variable der starter med disse farver
 if (p.mouseX>x-(radius/2) && p.mouseX<x+(radius/2) && p.mouseY>y-(radius/2) && p.mouseY<y+(radius/2)){
 //start sort
 p.fill(179,182,183,150);

 p.circle(x, y, radius+5);
 }
}
}



