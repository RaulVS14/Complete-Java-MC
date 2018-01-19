public class stringsType {
    public static void main(String[] args) {
        String myString = "This is a string";
        myString = myString + ", and this is more!";
        myString = myString + "\u00A9 2015";
        System.out.println(myString);
        String myNumberString = "250.55";
        myNumberString =  myNumberString + "5";
        System.out.println(myNumberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
    }
}
