import java.util.Scanner;

class AlphabhetOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println("Given Char is an Alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println("Given Char is a Digit");
        } else {
            System.out.println("Given Char is a Special Character");
        }

        sc.close();
    }
}
