package volum1;

public class Ex4 {
    public static void main(String[] args) {
        int x=39;
        int y=24;
        int z=x;
        System.out.println("x=" + x + " y= " + y);
        x=y;
        y=z;

        System.out.println("final x=" + x + " y= " + y);
    }
}
