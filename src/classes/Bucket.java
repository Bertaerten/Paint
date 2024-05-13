package classes;
//import java.applet.Applet;

import processing.core.*;


public class Bucket {
    
PApplet p;
int oldColor;
int newColor;
int maxY=Udseende.maksY;


public Bucket(PApplet s, int newColorIN){
 p=s;
 newColor = newColorIN;
}

public void fill(int oldColorIN){
    
    oldColor = oldColorIN;
    if(oldColor==newColor)
        return;
    
    p.loadPixels();
    for (int i=maxY*p.width ; i< p.pixels.length ; i++) {
        if(p.pixels[i]==oldColor){
            p.pixels[i] = newColor;
        }
    } 
    p.updatePixels();
}




public void setNewColor(int newColor) {
    this.newColor = newColor;
}

    
}


