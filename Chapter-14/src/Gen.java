// A simple generic class hierarchy. 
class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    // Return ob.
    T getOb() {
        return ob;
    }
}

// A subclass of Gen. 
class Gen2<T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }
}