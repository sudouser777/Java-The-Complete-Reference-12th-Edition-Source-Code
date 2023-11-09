public class MyModAppDemo {
    public static void main(String[] args) {
        Module myMod = MyModAppDemo.class.getModule();
        System.out.println("Module is " + myMod.getName());

        System.out.print("Packages: ");
        for (String pkg : myMod.getPackages()) System.out.println(pkg + " ");
    }
}