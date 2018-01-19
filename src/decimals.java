public class decimals {
    public static void main(String[] args) {

        int myIntValue = 5 / 2;

        // width 32 (4 bytes)
        float myFloatValue = 5f / 3f;

        // width 64 (8 bytes)
        double myDoubleValue = 5d / 3d;
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        double myPnds = 200d;
        double myKgs = myPnds * 0.45_35_92_37d;
        System.out.println("My kilograms " + myKgs);

    }
}
