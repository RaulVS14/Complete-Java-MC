public class looping {
    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {

            System.out.println("10 000 at " + i + "% interest = " + String.format("%.2f", calculateInterval(10_000, i)));
        }

        for (int i = 8; i >= 2; i--) {

            System.out.println("10 000 at " + i + "% interest = " + String.format("%.2f", calculateInterval(10_000, i)));
        }

        int count= 0;
        for (int i = 220; i <= 300; i++) {

            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
            if(count == 3){
                break;
            }
        }

    }

    public static double calculateInterval(double amnt, double intRate) {
        return (amnt * (intRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
