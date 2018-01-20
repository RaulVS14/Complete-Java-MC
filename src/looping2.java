public class looping2 {
    public static void main(String[] args) {
        int count = 0;
        while (count != 5) {
            count++;
        }
        int number = 5;
        int finishNumber = 20;
        int evenCount = 0;

        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            evenCount++;
            System.out.println("Even number " + number);
            number++;
            if (evenCount==5) {
                System.out.println(evenCount);
                break;
            }
        }
    }
    public static boolean isEvenNumber(int n) {
        return n % 2 == 0;
    }
}
