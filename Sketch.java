import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
	PImage imgMonastery;
  PImage imgRowlet;
  PImage imgSupaHotFire;

  // Rowlet location and speeds
  float floatRowletX = -5;
  float floatRowletY = -50;
  float floatRowletSpeedX = 10;
  float floatRowletSpeedY = 0;

  // Circle location and speeds
  float floatCircleX = 800;
  float floatCircleY = 400;
  float floatCircleSpeedX = 10;
  float floatCircleSpeedY = 10;

  // Supa Hot Fire locations
  int radian;
  float imageX = 500;
  float imageY = 300;
  
  public void settings() {
	// put your size call here
    size(1600, 800);
  }

  // Sets up the Background
  public void setup() {
    imgMonastery = loadImage("garreg mach monastery.png");
    imgRowlet = loadImage("rowlet-removebg-preview.png");
    imgSupaHotFire = loadImage("supa hot fire.jpg");
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
    fill(238, 10, 158);
    ellipse(floatCircleX, floatCircleY, 200, 200);

    // Update Circle's position
    floatCircleX = floatCircleX + floatCircleSpeedX;
    floatCircleY = floatCircleY + floatCircleSpeedY;

    // Basic Edge Detection and Switch Direction when CIRCLE hits the border.
    if(floatCircleX < 0 + 130) {
      floatCircleSpeedX = floatCircleSpeedX * -1;
    }
    else if(floatCircleX > width - 170) {
      floatCircleSpeedX = floatCircleSpeedX * -1;
    }

    if(floatCircleY < 100) {
      floatCircleSpeedY = floatCircleSpeedY * -1;
    }
    else if(floatCircleY > height - 150) {
      floatCircleSpeedY = floatCircleSpeedY * -1;

    }

    // Make Supa Hot Fire move in a circle
    imgSupaHotFire.resize(200, 200);
    radian += 2;
    imageX += (float) (100 * Math.sin(radian));
    imageY += (float) (100 * Math.cos(radian));
    image(imgSupaHotFire, imageX, imageY); 


  }
    
}