import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

Bacteria [] colony;  
 public void setup()   
 {     
 	size(100,100); 
 	background(255);
 	
 	colony = new Bacteria[100];
 	for(int i=0; i<colony.length; i++)
 	{
 		int numX = (int)(Math.random()*500);
 		int numY = (int)(Math.random()*500);
 		colony[i] = new Bacteria(numX, numY);
 	}
 }   
 public void draw()   
 {   
  	for(int i = 0; i<colony.length; i++)
  	{
  		colony[i].move();
  		colony[i].show();
  	} 
 }  
 class Bacteria    
 {     
 	int myX, myY, myR, num;
 	Bacteria(int x, int y)
 	{
 		myX = x;
 		myY = y;
 		myR = (int)(Math.random()*255);
 		num = (int)(Math.random()*3);
 	}   
 	public void move()
 	{
 		myX += (int)(Math.random()*3)-1;
 		myY += (int)(Math.random()*3)-1;
 	}
 	public void show()
 	{

 			fill(255);
 			stroke(myR,0,0);
 			ellipse(myX,myY,10,10);
 	}

 }   
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
