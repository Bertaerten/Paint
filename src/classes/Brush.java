package classes;
//import java.applet.Applet;
//import math.*;

import processing.core.*;


public class Brush {
    
PApplet p;
int r;
int minX=Udseende.minX, maksX=Udseende.maksX, minY=Udseende.minY, maksY=Udseende.maksY;
int Color;
float haardhed;
int oldx, oldy;

public Brush(int radius, int ColorIN ,float hard, PApplet s){
r=radius;
 p=s;
Color = ColorIN;
haardhed=hard;

/*
 if (r%2 != 0){ // størrelsen af brushen skal være et lige tal
    r++;
 } */
}

public void setPixels(){
    //p.colorMode(1, 255);// RGB mode
    //p.loadPixels();

    for(int i=0; i<r ; i++){
        for(int j=0;j<r;j++){
            if(p.mouseX+(i-(r/2)) > minX && p.mouseX+(i-(r/2))< maksX){
                if (p.mouseY-(j-(r/2)) > minY && p.mouseY-(j-(r/2)) < maksY) {
                  /*  
                    float pw1= (r/2)-i;
                    float pw2= (r/2)-j;

                    double dist = PApplet.dist(i, j, pw1, pw2); //Math.sqrt( Math.pow(pw1,2) + Math.pow(pw2, 2) );// (i-x)^2 + (j-y)^2
                    
                    dist =  dist/(r*0.70711f);//mellem 0 og 1 ca.
                */
                    float alpha =haardhed*255;
                    p.stroke(Color, 1000); 
                    p.point(p.mouseX+(i-(r/2)), p.mouseY-(j-(r/2))); 

                    //p.pixels[p.mouseX+(i-(r/2)) + (p.mouseY-(j-(r/2)))*p.width] = p.color(p.red(Color), p.green(Color), p.blue(Color), alpha);
                }
            }
        }
        
        //p.updatePixels();
    }


}

public void lineDraw() {
int sizeConstant=5; 
    if (p.pmouseX - (r / sizeConstant) > minX && p.pmouseX + (r / sizeConstant) < maksX) {
        if (p.pmouseY - (r / sizeConstant) > minY && p.pmouseY + (r / sizeConstant) < maksY) {
            if (p.mouseX - (r / sizeConstant) > minX && p.mouseX + (r / sizeConstant) < maksX) {
                if (p.mouseY - (r/ sizeConstant) > minY && p.mouseY + (r / sizeConstant) < maksY) {
                    p.strokeCap(PConstants.ROUND);
                    p.strokeWeight(2*r / sizeConstant);
                    p.stroke(Color, haardhed * 255);
                    p.line(p.pmouseX, p.pmouseY, p.mouseX, p.mouseY);

                    p.strokeWeight(1);
                }
            }
        }
    }
}

public void spray (){
    float radx;   // Radius
    float rady;
    float v; // vinkel
    float x;      // result
    float y;
    p.stroke(Color);
    //
    for (int i=0; i < (haardhed*15*r +10); i++) {
      radx=p.random(r);
      rady=p.random(r);
      v= p.random(359);
      //
      x=(radx*PApplet.cos(PApplet.radians(v)))+p.mouseX;
      y=(rady*PApplet.sin(PApplet.radians(v)))+p.mouseY;
      //
      if(x> minX && x< maksX && y>minY && y< maksX){
      p.point(x, y);
      }
    }
}


public void setSize(int change){
    r=change;
}
public void setColor(int newColor){
    Color=newColor;
}
public void setHard(float hard){
    haardhed = hard;
}
}


