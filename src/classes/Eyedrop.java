package classes;
//import java.applet.Applet;

import processing.core.*;


public class Eyedrop {
    
PApplet p;


public Eyedrop(PApplet s){
 p=s;
}

public int getColor(){
    p.loadPixels();
    int color = p.pixels[p.mouseX+p.mouseY*p.width];
    return color;
}

}


