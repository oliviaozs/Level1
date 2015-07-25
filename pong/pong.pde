import ddf.minim.*;
Minim minim;
AudioSample sound;
PImage backgroundImage;
PImage gameOver;
int imageWidth = 600;
int imageHeight = 800;
int paddleLength = 100;
int paddleY = 720;
int xPosition = 300;
int xSpeed = 6;
int yPosition = 0;
int ySpeed = 6;
int lives = 3;

void setup() {
  backgroundImage = loadImage("tenniscourt 2.jpg");
  minim = new Minim (this);
  sound = minim.loadSample("35679__jobro__laser2.wav", 128);
  size (600, 800);
  println("Lives: " + lives);
}

void draw() {
  image (backgroundImage, 0, 0, imageWidth, imageHeight);
  fill (153, 51, 255);
  stroke (153, 51, 255);
  ellipse (xPosition, yPosition, 30, 30);
  fill (255, 153, 51);
  stroke (255, 153, 51);
  rect (mouseX, paddleY, paddleLength, 20);
  xPosition += xSpeed;
  yPosition += ySpeed;
  if (xPosition >= imageWidth || xPosition <= 0) {
    xSpeed = -xSpeed;
    sound.trigger();
  }
  if (yPosition <= 0) {
    ySpeed = -ySpeed;
    sound.trigger();
  }
  if (intersects(xPosition, yPosition, mouseX, paddleY, paddleLength)) {
    ySpeed = -ySpeed;
  }
  if (yPosition >= imageHeight) {
    xSpeed = 0;
    ySpeed = 0;
    lives --;
    delay(1000);
    println("Lives: " + lives);
    if (lives == 0) {
      println("GAME OVER");
      exit();
    }
    xPosition = 300;
    yPosition = 0;
    xSpeed = 6;
    ySpeed = 6;
  }
 
}

boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
return true;
else 
return false;
}


