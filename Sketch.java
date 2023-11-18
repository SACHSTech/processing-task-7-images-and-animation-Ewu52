import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
	PImage imgMonastery;
  PImage imgRowlet;

  // Rowlet location and speeds
  float floatRowletX = -5;
  float floatRowletY = -50;
  float floatRowletSpeedX = 5;
  float floatRowletSpeedY = 0;
  
  public void settings() {
	// put your size call here
    size(1600, 800);
  }

  // Sets up the Background
  public void setup() {
    imgMonastery = loadImage("garreg mach monastery.png");
    imgRowlet = loadImage("rowlet-removebg-preview.png");
  }

  public void draw() {
	   
    // Draw the Background
    image(imgMonastery, -500, -500);

    // Draw Rowlet
    image(imgRowlet, floatRowletX, floatRowletY);

    // Update Rowlet's position
    floatRowletX = floatRowletX + floatRowletSpeedX;

    // Basic Edge Detection and Switch Direction when ROWLET hits the border.
    if(floatRowletX < 0) {
      floatRowletSpeedX = floatRowletSpeedX * -1;
    }
    else if(floatRowletX > 1600 - 550) {
      floatRowletSpeedX = floatRowletSpeedX * -1;
    }

    // Print Circle
    //fill(238, 10, 158);
    //ellipse(floatCircleX, floatCircleY, 200, 200);

    // Update Circle's position
    // floatCircleX = floatCircleX + floatCircleSpeedX;
    // floatCircleY = floatCircleX * floatCircleX;

    // Basic Edge Detection and Switch Direction when CIRCLE hits the border.
    // if(floatCircleX < 0) {
      //floatCircleX = floatCircleX * -1;
    //}
    //else if(floatCircleX > width - 200) {
    //  floatCircleX = floatCircleX * -1;
    //}

   // if(floatCircleY < 100) {
     // floatCircleY = floatCircleY * -1;
    //}
    //else if(floatCircleY > height + 200) {
    //  floatCircleY = floatCircleY * -1;
   // }

    
    double circleX = 100;
    double circleY = 100;
    double circleRadius = 50;
    int time = 1;

    for(time = 1; time <=100; time++){

    double orbitalPeriod = 2000.0;
    double portion = (time % orbitalPeriod) / orbitalPeriod;
    double angle = portion * 2 * Math.PI;

    circleX = circleX + circleRadius * Math.sin(angle);
    circleY = circleY + circleRadius * Math.sin(angle);

    fill(240, 128, 123); 
    ellipse((float)circleX, (float)circleY, (float)circleRadius, (float)circleRadius);
    }
    

  }
    
  
  
}