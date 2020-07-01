
void setup() {
PImage face = loadImage("cat.jpg");
size(500,500);
face.resize(500, 500);
image(face, 0, 0);
}
void draw() {
  fill(mouseX, 255, mouseY);
ellipse(155,220,50,50);
ellipse(270,220,50,50);
  fill(#050505);
ellipse(155,220,20,40);
ellipse(270,220,20,40);
}
