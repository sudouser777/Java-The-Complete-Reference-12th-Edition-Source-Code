// A Simple demonstration of abstract.
abstract class A {
    abstract void callme();

    // concrete methods are still allowed in abstract classes
    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}

class B extends A {
    void callme() {
        System.out.println("B's implementation of callme.");
    }
}


class AbstractDemo {
    public static void main(String[] args) {
        B b = new B();

        b.callme();
        b.callmetoo();
    }
}