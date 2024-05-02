package classes;
import java.applet.Applet;
//import math.*;

import processing.core.*;


public class Brush {
    
PApplet p;
int r;
int minX=0, maksX=1920, minY=200, maksY=1080;
int Color;
float haardhed;

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
    p.loadPixels();

    for(int i=0; i<r ; i++){
        for(int j=0;j<r;j++){
            if(p.mouseX+(i-(r/2)) > minX && p.mouseX+(i-(r/2))< maksX){
                if (p.mouseY-(j-(r/2)) > minY && p.mouseY-(j-(r/2)) < maksY) {
  
                    double pw1= (r/2)-i;
                    double pw2= (r/2)-j;

                    double dist = Math.sqrt( Math.pow(pw1,2) + Math.pow(pw2, 2) );// (i-x)^2 + (j-y)^2
                    
                    dist =  dist/(r*0.70711f);//mellem 0 og 1 ca.
                    
                    float alpha ;
                    if ( dist >= haardhed){
                        alpha = (float) (0);
                    } else{
                        alpha = (float) (255);
                    }

                    p.pixels[p.mouseX+(i-(r/2)) + (p.mouseY-(j-(r/2)))*p.width] = p.color(p.red(Color), p.green(Color), p.blue(Color), alpha);
                }
            }
        }
        
        p.updatePixels();
    }


}


public void ChangeSize(int change){
    r=r+change;
}
public void setColor(int newColor){
    Color=newColor;
}
public void sethard(float hard){
    haardhed = hard;
}
}


