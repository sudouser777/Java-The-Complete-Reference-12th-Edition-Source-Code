import mypack.Balance2;

class TestBalance {
    public static void main(String[] args) {
    
    /* Because Balance is public, you may use Balance 
       class and call its constructor. */
        Balance2 test = new Balance2("J. J. Jaspers", 99.88);

        test.show(); // you may also call show()
    }
}