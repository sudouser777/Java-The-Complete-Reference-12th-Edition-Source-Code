public class InstanceOfDemo {

    public static void main(String[] args) {
        Number num = Integer.valueOf(100);

        if (num instanceof Integer numInt) {
            System.out.println("numInt is of type: " + numInt.getClass());
        }

        if (num instanceof Integer numInt && numInt < 1000) {
            System.out.println("Number less than 1000");
        }

    }
}
