package classes;
import java.applet.Applet;

import processing.core.*;


public class brush {
    
PApplet p;
int r;
int minX=50, maksX=250, minY=50, maksY=250;
int Color;

public brush(int radius, int ColorIN , PApplet s){
r=radius;
 p=s;
Color = ColorIN;
/*
 if (r%2 != 0){ // størrelsen af brushen skal være et lige tal
    r++;
 } */
}

public void setPixels(){

    for(int i=0; i<r ; i++){
        for(int j=r;j>0;j--){
            if(p.mouseX+(i-(r/2)) > minX && p.mouseX+(i-(r/2))< maksX){
                if (p.mouseY-(j-(r/2)) > minY && p.mouseY-(j-(r/2)) < maksY) {
                    p.set(p.mouseX+(i-(r/2)), p.mouseY-(j-(r/2)), Color);
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


