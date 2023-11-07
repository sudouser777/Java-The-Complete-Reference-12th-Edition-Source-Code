/* Here, Box8 uses a parameterized constructor to
   initialize the dimensions of a box.
*/
class Box8 {
    double width;
    double height;
    double depth;

    // This is the constructor for Box8.
    Box8(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo7 {
    public static void main(String[] args) {
        // declare, allocate, and initialize Box8 objects
        Box8 mybox1 = new Box8(10, 20, 15);
        Box8 mybox2 = new Box8(3, 6, 9);

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}