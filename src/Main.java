public class Main {
    public static void main(String[] args) {

        // integer has a width of 32
        int myMinValue = -2_147_483_648; //literal
        int myMaxValue = 2_147_483_647; //literal
        int myTotal = (myMinValue / 2);
        System.out.println(myTotal);

        // byte has a width of 8
        byte myByteMinValue = -128; //literal
        byte myByteMaxValue = 127; //literal

        byte myNewByteValue = (byte) (myByteMinValue / 2);
        System.out.println(myNewByteValue);
        // short has a width of 16
        short myShortMinValue = -32768;//literal
        short myShortMaxValue = 32_767;//literal
        short myNewShortValue = (short) (myShortMinValue / 2);
        System.out.println(myNewShortValue);

        // long has a width of 64
        long myLongValue = 100L;
        long myLongMinValue = -9_223_372_036_854_775_808L;
        long myLongMaxValue = 9_223_372_036_854_775_807L;


        // CHALLENGE

        byte myChallengeByte = 32;
        short myChallengeShort = 32_000;
        int myChallengeInt = 32_900;
        long myChallengeLong = 50000L + 30L * (myChallengeByte + myChallengeShort + myChallengeInt);
        System.out.println(myChallengeLong);

    }
}
