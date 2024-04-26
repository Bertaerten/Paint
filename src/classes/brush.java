package classes;
import java.applet.Applet;
//import math.*;

import processing.core.*;


public class brush {
    
PApplet p;
int r;
int minX=50, maksX=250, minY=50, maksY=250;
int Color;
float haardhed;

public brush(int radius, int ColorIN , PApplet s){
r=radius;
 p=s;
Color = ColorIN;
haardhed=0.5f;
/*
 if (r%2 != 0){ // størrelsen af brushen skal være et lige tal
    r++;
 } */
}

public void setPixels(){

    for(int i=0; i<r ; i++){
        for(int j=0;j<r;j++){
            if(p.mouseX+(i-(r/2)) > minX && p.mouseX+(i-(r/2))< maksX){
                if (p.mouseY-(j-(r/2)) > minY && p.mouseY-(j-(r/2)) < maksY) {
                    double pw1= (r/2)-i;
                    double pw2= (r/2)-j;

                    double l = Math.sqrt( Math.pow(pw1,2) + Math.pow(pw2, 2) );// (i-x)^2 + (j-y)^2
                    System.out.println(l);
                    int alpha = (int) (r/l); 
                    int farve = p.color(0,0,0, alpha);

                    p.set(p.mouseX+(i-(r/2)), p.mouseY-(j-(r/2)), farve);
                }
                
            }
        }
    }


}

public void ChangeSize(int change){
    r=r+change;
}
public void setColor(int newColor){
    Color=newColor;
}
}


