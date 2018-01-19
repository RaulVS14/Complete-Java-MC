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



        // CHALLENGE

        int score = 800;
        int levelCompleted = 5;

        int bonus = 100;
        boolean gameOver = true;
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver){

            int finalScore = score + (levelCompleted*bonus);
            System.out.println("Your final score was " + finalScore);
        }


    }
}
