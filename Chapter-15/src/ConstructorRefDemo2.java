
// Demonstrate a constructor reference with a generic class.

// MyFunc4 is now a generic functional interface.
interface MyFunc4<T> {
    MyClassG<T> func(T n);
}

class MyClassG<T> {
    private T val;

    // A constructor that takes an argument.
    MyClassG(T v) {
        val = v;
    }

    // This is the default constructor.
    MyClassG() {
        val = null;
    }

    // ...

    T getVal() {
        return val;
    }

    ;
}

class ConstructorRefDemo2 {

    public static void main(String[] args) {
        // Create a reference to the MyClassG<T> constructor.
        MyFunc4<Integer> myClassCons = MyClassG<Integer>::new;

        // Create an instance of MyClassG<T> via that constructor reference.
        MyClassG<Integer> mc = myClassCons.func(100);

        // Use the instance of MyClassG<T> just created.
        System.out.println("val in mc is " + mc.getVal());
    }
}
