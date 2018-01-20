public class switchClass {
    public static void main(String[] args) {
        char myChar = 'A';
        switch (myChar) {
            case 'A':
                System.out.println("It was A");
                break;
            case 'B':
                System.out.println("It was B");
                break;
            case 'C':
                System.out.println("It was C");
                break;
            case 'D':
                System.out.println("It was D");
                break;
            case 'E':
                System.out.println("It was E");
                break;
            default:
                System.out.println("Letter not found");
                break;
        }
    }
}
