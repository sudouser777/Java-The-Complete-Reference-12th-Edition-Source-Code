// Demonstrate a Constructor reference.

// MyFunc3 is a functional interface whose method returns
// a MyClass2 reference.
interface MyFunc3 {
    MyClass2 func(int n);
}

class MyClass2 {
    private int val;

    // This constructor takes an argument.
    MyClass2(int v) {
        val = v;
    }

    // This is the default constructor.
    MyClass2() {
        val = 0;
    }

    // ...

    int getVal() {
        return val;
    }

    ;
}

class ConstructorRefDemo {
    public static void main(String[] args) {
        // Create a reference to the MyClass2 constructor.
        // Because func() in MyFunc3 takes an argument, new
        // refers to the parameterized constructor in MyClass2,
        // not the default constructor.
        MyFunc3 myClassCons = MyClass2::new;

        // Create an instance of MyClass2 via that constructor reference.
        MyClass2 mc = myClassCons.func(100);

        // Use the instance of MyClass2 just created.
        System.out.println("val in mc is " + mc.getVal());
    }
}