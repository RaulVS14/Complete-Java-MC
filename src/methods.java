public class methods {
    public static void main(String[] args) {

        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        boolean gameOver = true;

        int finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + finalScore);

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;
        gameOver = true;

        finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + finalScore);

        displayHighscorePosition("Rawl", calculateHighscorePosition(1500));
        displayHighscorePosition("Rawl", calculateHighscorePosition(900));
        displayHighscorePosition("Rawl", calculateHighscorePosition(400));
        displayHighscorePosition("Rawl", calculateHighscorePosition(50));

        System.out.println(calcFtAndInToCm(7,0));
        System.out.println(calcFtAndInToCm(175));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;

        }
        return -1;
    }

    public static void displayHighscorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighscorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore < 1000 && playerScore >= 500) {
            return 2;
        } else if (playerScore < 500 && playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }


    public static double calcFtAndInToCm(int ft, int inch) {
        if (ft < 0 || (inch >= 12 || inch < 0)) {
            return -1;
        }
        double toCm = ft*30.48 + inch*2.54;
        return toCm;
    }

    public static double calcFtAndInToCm(int inch) {
        if (inch<0) {
            return -1;
        }
        int toInches = inch%12;
        int toFeet = inch/12;
        return calcFtAndInToCm(toFeet,toInches);
    }
}
