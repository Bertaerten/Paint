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
    p.colorMode(1, 255);// RGB mode

    for(int i=0; i<r ; i++){
        for(int j=0;j<r;j++){
            if(p.mouseX+(i-(r/2)) > minX && p.mouseX+(i-(r/2))< maksX){
                if (p.mouseY-(j-(r/2)) > minY && p.mouseY-(j-(r/2)) < maksY) {
                    
                    double pw1= (r/2)-i;
                    double pw2= (r/2)-j;

                    double dist = Math.sqrt( Math.pow(pw1,2) + Math.pow(pw2, 2) );// (i-x)^2 + (j-y)^2
                    
                    dist =  dist/(r*0.70711f);//mellem 0 og 1 ca.

                    //længde x mellem 1 og 0, haardhed a >0 :  alpha/255 = 1-x^(a/x)
                    

                    //double x =() ;

                    float alpha = (float) (15-(dist*155*haardhed));

                    p.pixels[p.mouseX+(i-(r/2)) + (p.mouseY-(j-(r/2)))*p.width] = p.color(p.red(Color), p.green(Color), p.blue(Color), alpha);
                    //p.set(p.mouseX+(i-(r/2)), p.mouseY-(j-(r/2)), Color);
                }
                
            }
        }
    }


}

    public void setPixelsNew(){

            /*
             * i= y*width + x
             * 
             * x=i-y*width
             * y=(i-x)/width
             * ?
             */
          
                p.pixels[p.mouseY*p.width  +  p.mouseX]= p.color(p.red(Color), p.green(Color), p.blue(Color), 100);

    }

public void ChangeSize(int change){
    r=r+change;
}
public void setColor(int newColor){
    Color=newColor;
}
}


