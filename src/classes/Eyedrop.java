package classes;
//import java.applet.Applet;

import processing.core.*;


public class Eyedrop {
    
PApplet p;


public Eyedrop(PApplet s){
 p=s;
}

public int getColor(){
    return p.get(p.mouseX, p.mouseY);
}

}


