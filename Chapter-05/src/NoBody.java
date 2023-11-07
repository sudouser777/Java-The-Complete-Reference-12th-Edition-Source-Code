// The target of a loop can be empty. 
class NoBody {
    public static void main(String[] args) {
        int i, j;

        i = 100;
        j = 200;

        // find midpoint between i and j
        while (++i < --j) ; // no body in this loop

        System.out.println("Midpoint is " + i);
    }
}