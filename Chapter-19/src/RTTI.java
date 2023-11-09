// Demonstrate Run-Time Type Information.

class X {
    int a;
    float b;
}

class Y extends X {
    double c;
}

class RTTI {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Class<?> clObj;

        clObj = x.getClass(); // get Class reference
        System.out.println("x is object of type: " +
                clObj.getName());

        clObj = y.getClass(); // get Class reference
        System.out.println("y is object of type: " +
                clObj.getName());
        clObj = clObj.getSuperclass();
        System.out.println("y's superclass is " +
                clObj.getName());
    }
}