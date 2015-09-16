Bacteria [] colony;  
 void setup()   
 {     
 	size(500,500); 
 	background(255);
 	
 	colony = new Bacteria[100];
 	for(int i=0; i<colony.length; i++)
 	{
 		int numX = (int)(Math.random()*500);
 		int numY = (int)(Math.random()*500);
 		colony[i] = new Bacteria(numX, numY);
 	}
 }   
 void draw()   
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
 	void move()
 	{
 		myX += (int)(Math.random()*3)-1;
 		myY += (int)(Math.random()*3)-1;
 	}
 	void show()
 	{

 			fill(255);
 			stroke(myR,0,0);
 			ellipse(myX,myY,10,10);
 	}

 }   