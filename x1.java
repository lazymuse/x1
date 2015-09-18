//////// What am I trying to do???
//////// What is my name?  (CST 112; today's date?)

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 100,150,200 );                // sky
  fill( 255,255,0 );
  ellipse( width*3/4, height/8, 40,40 );    // sun
  // Grass
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  /* INSERT YOUR CODE HERE! */
  triangle( 150,horizon, 120,horizon-50, 180,horizon-50  );  // tree
  text( "This is NOT a good tree; please fix it!", 150,horizon );
                                            // house

  fill(0);
  text( "My name is Mud", 10,height-20 );                                          
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
  
  // show the snowman
  snowman();
}

void snowman() {
  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  fill(255,0,0); rect( x,y, 30,50 );        /* REPLACE THIS WITH YOUR OWN CODE! */
  text( "Fred", x,y );
  
  ellipse(250,250,80,80);// body 1//
  ellipse(250,325,80,80);// body 2//
  ellipse(260,380,80,80);// body 3//
  ellipse(250,450,80,80);// body 4//
  line(210,240,150,200); // left arm body 1//
  line(210,320,150,350); //left arm body 2//
  line(290,240,350,200); //right arm body 1//
  line(290,320,350,310); //right arm body 2//
  
  fill(255,255,255);
  ellipse(250,200,60,60);// head//
  
  ellipse(250,180,80,20);//bottom hat//
  rect(220,100,60,80); //top hat//
  fill(0);
  ellipse(230,200,10,10); // left eye//
  fill(0);
  ellipse(270,200,10,10);// right eye//
  fill(204);
  triangle(250,210,230,210,237,222); //mouth//
  
  
  

}


//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
}
   
   

