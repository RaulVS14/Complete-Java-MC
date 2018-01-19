public class operators {
    public static void main(String[] args) {
        boolean isAlien = false;
        if (!isAlien)
            System.out.println("It is not an alien");

        double myDouble = 20d;
        double my2ndDouble = 80d;
        double mySum = (myDouble + my2ndDouble) * 25;
        double myRemainder = mySum%40;
        if(myRemainder <= 20)
            System.out.println("Total was over the limit");
    }
}
