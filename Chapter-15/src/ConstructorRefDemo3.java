// Implement a simple class factory using a constructor reference.

interface MyFunc<R, T> {
    R func(T n);
}

// A simple generic class.
class MyClass<T> {
    private T val;

    // A constructor that takes an argument.
    MyClass(T v) {
        val = v;
    }

    // The default constructor. This constructor
    // is NOT used by this program.
    MyClass() {
        val = null;
    }
    // ...

    T getVal() {
        return val;
    }

    ;
}

// A simple, non-generic class.
class MyClass {
    String str;

    // A constructor that takes an argument.
    MyClass(String s) {
        str = s;
    }

    // The default constructor. This
    // constructor is NOT used by this program.
    MyClass() {
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
    static <R, T> R myClassFactory(MyFunc<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        // Create a reference to a MyClass constructor.
        // In this case, new refers to the constructor that
        // takes an argument.
        MyFunc<MyClass<Double>, Double> myClassCons = MyClass<Double>::new;

        // Create an instance of MyClass by use of the factory method.
        MyClass<Double> mc = myClassFactory(myClassCons, 100.1);

        // Use the instance of MyClass just created.
        System.out.println("val in mc is " + mc.getVal());

        // Now, create a different class by use of myClassFactory().
        MyFunc<MyClass, String> myClassCons2 = MyClass::new;

        // Create an instance of MyClass by use of the factory method.
        MyClass mc2 = myClassFactory(myClassCons2, "Lambda");

        // Use the instance of MyClass just created.
        System.out.println("str in mc2 is " + mc2.getVal());
    }
}