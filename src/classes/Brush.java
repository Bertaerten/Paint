package classes;


import processing.core.*;


public class Brush {
    
PApplet p;
int r;
int minX=Udseende.minX, maksX=Udseende.maksX, minY=Udseende.minY, maksY=Udseende.maksY;
int Color;
float hardness;
int oldx, oldy;

public Brush(int radius, int ColorIN ,float hard, PApplet s){
r=radius;
p=s;
Color = ColorIN;
hardness=hard;


}

public void setPixels(){
    for(int i=0; i<r ; i++){
        for(int j=0;j<r;j++){
            if(p.mouseX-(i-(r/2)) > minX && p.mouseX-(i-(r/2))< maksX){
                if (p.mouseY-(j-(r/2)) > minY && p.mouseY-(j-(r/2)) < maksY) {
                   
                    float pw1= r-i;
                    float pw2= r-j;

                    double dist = PApplet.dist(i, j, pw1, pw2); 
                    
                    dist =  dist/(r*0.70711f);
                
                    float alpha =hardness*255* (float) (1-dist);
                    p.stroke(Color, alpha); 
                    p.point(p.mouseX-(i-(r/2)), p.mouseY-(j-(r/2))); 
                }
            }
        }
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
                    p.stroke(Color, hardness * 255);
                    p.line(p.pmouseX, p.pmouseY, p.mouseX, p.mouseY);

                    p.strokeWeight(1);
                }
            }
        }
    }
}

public void spray (){
    float randR;   
    float v; 
    float x;
    float y;
    p.stroke(Color);
    
    for (int i=0; i < (hardness*15*r +10); i++) {
      randR=p.random(r);
      v= p.random(360);
      
      x=(randR*PApplet.cos(PApplet.radians(v)))+p.mouseX;
      y=(randR*PApplet.sin(PApplet.radians(v)))+p.mouseY;
      
      if(x> minX && x< maksX && y>minY && y< maksX){
      p.point(x, y);
      }
    }
}


public void setSize(int newR){
    r=newR;
}
public void setColor(int newColor){
    Color=newColor;
}
public void setHard(float newHardness){
    hardness = newHardness;
}
}


