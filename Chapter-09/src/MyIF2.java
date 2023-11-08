public interface MyIF2 {
    // This is a static interface method.
    static int getDefaultNumber() {
        return 0;
    }

    // This is a "normal" interface method declaration.
    // It does NOT define a default implementation.
    int getNumber();

    // This is a default method. Notice that it provides
    // a default implementation.
    default String getString() {
        return "Default String";
    }
}