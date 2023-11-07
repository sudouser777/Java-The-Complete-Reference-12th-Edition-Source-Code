/* Here, Box7 uses a constructor to initialize the
   dimensions of a box.
*/
class Box7 {
    double width;
    double height;
    double depth;

    // This is the constructor for Box7.
    Box7() {
        System.out.println("Constructing Box7");
        width = 10;
        height = 10;
        depth = 10;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo6 {
    public static void main(String[] args) {
        // declare, allocate, and initialize Box7 objects
        Box7 mybox1 = new Box7();
        Box7 mybox2 = new Box7();

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}