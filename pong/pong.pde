import ddf.minim.*;
Minim minim;
AudioSample sound;
PImage backgroundImage;
int xPosition = 300;
int xSpeed = 3;
int yPosition = 400;
int ySpeed = 3;

void setup() {
  backgroundImage = loadImage("tenniscourt 2.jpg");
  minim = new Minim (this);
  sound = minim.loadSample("35679__jobro__laser2.wav", 128);
  size (600, 800);
}

void draw() {
  image (backgroundImage, 0, 0, 600, 800);
  fill (255, 255, 51);
  stroke (255, 255, 51);
  ellipse (xPosition, yPosition, 30, 30);
  fill (0, 0, 255);
  stroke (0, 0, 255);
  rect (mouseX, 720, 100, 20);
  xPosition += xSpeed;
  yPosition += ySpeed;
  if (xPosition >= 600 || xPosition <= 0) {
    xSpeed = -xSpeed;
    sound.trigger();
  }
  if (yPosition <= 0) {
    ySpeed = -ySpeed;
    sound.trigger();
  }
  if (intersects(xPosition, yPosition, mouseX, 720, 100)) {
    ySpeed = -ySpeed;
  }
  if (yPosition >= 800) {
    xSpeed = 0;
    ySpeed = 0;
  }
 
}

boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
return true;
else 
return false;
}


