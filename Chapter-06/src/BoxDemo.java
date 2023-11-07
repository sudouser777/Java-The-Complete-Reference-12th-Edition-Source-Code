/* A program that uses the Box2 class.

   Call this file Box2Demo.java
*/
class Box2 {
    double width;
    double height;
    double depth;
}

// This class declares an object of type Box2.
class BoxDemo {

    public static void main(String[] args) {
        Box2 mybox = new Box2();
        double vol;

        // assign values to mybox's instance variables
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // compute volume of box
        vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("Volume is " + vol);
    }
}