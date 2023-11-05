// Implement a simple class factory using a constructor reference.

interface MyFunc5<R, T> {
    R func(T n);
}

// A simple generic class.
class MyClassG2<T> {
    private T val;

    // A constructor that takes an argument.
    MyClassG2(T v) {
        val = v;
    }

    // The default constructor. This constructor
    // is NOT used by this program.
    MyClassG2() {
        val = null;
    }
    // ...

    T getVal() {
        return val;
    }

    ;
}

// A simple, non-generic class.
class MyClass3 {
    String str;

    // A constructor that takes an argument.
    MyClass3(String s) {
        str = s;
    }

    // The default constructor. This
    // constructor is NOT used by this program.
    MyClass3() {
        str = "";
    }

    // ...

    String getVal() {
        return str;
    }

    ;
}

class ConstructorRefDemo3 {

    // A factory method for class objects. The class must
    // have a constructor that takes one parameter of type T.
    // R specifies the type of object being created.
    static <R, T> R myClassFactory(MyFunc5<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        // Create a reference to a MyClassG2 constructor.
        // In this case, new refers to the constructor that
        // takes an argument.
        MyFunc5<MyClassG2<Double>, Double> myClassCons = MyClassG2<Double>::new;

        // Create an instance of MyClassG2 by use of the factory method.
        MyClassG2<Double> mc = myClassFactory(myClassCons, 100.1);

        // Use the instance of MyClassG2 just created.
        System.out.println("val in mc is " + mc.getVal());

        // Now, create a different class by use of myClassFactory().
        MyFunc5<MyClass3, String> myClassCons2 = MyClass3::new;

        // Create an instance of MyClass3 by use of the factory method.
        MyClass3 mc2 = myClassFactory(myClassCons2, "Lambda");

        // Use the instance of MyClass3 just created.
        System.out.println("str in mc2 is " + mc2.getVal());
    }
}