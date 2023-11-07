/* Here, Box9 uses a parameterized constructor to
   initialize the dimensions of a box.
*/
class Box9 {
    double width;
    double height;
    double depth;

    // A redundant use of this.
    Box9(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class Box10 {
    double width;
    double height;
    double depth;

    // Use this to resolve name-space collisions.
    Box10(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}