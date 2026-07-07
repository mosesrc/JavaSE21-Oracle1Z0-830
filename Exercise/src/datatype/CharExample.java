package datatype;

public class CharExample {
    public static void main(String[] args) {
        // Char Data Type -> integer between 0-65535 -> 'A'
        char c1 = 72; // 72 in decimal
        char c2 = 53; // 53 in decimal

        System.out.println("c1: " + c1);
        System.out.println("is first variable letter ? " + Character.isLetter(c1));
        System.out.println("is first variable digit ? " + Character.isDigit(c1));

        System.out.println("c2: " + c2);
        System.out.println("is second variable letter ? " + Character.isLetter(c2));
        System.out.println("is second variable digit ? " + Character.isDigit(c2));

        char letter1 = 67;
        int num1 = letter1 + 3;
        char letter2 = (char) num1;

        System.out.println("letter2 is " + letter2);

        char letter3 = 70; // F in ASCII
        char letter4 = letter3--;
        boolean check1 = letter4 == 'E';
        boolean check2 = letter3 > 'D';

        System.out.println("check1 : " + check1);
        System.out.println("check2 : " + check2);
    }
}
