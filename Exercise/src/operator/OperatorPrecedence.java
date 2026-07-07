package operator;

public class OperatorPrecedence {

    public static void main(String[] args) {

        int result = 5 + 2 * 4;
        System.out.println("Result: " + result);

        result = (5 + 2) * 4;
        System.out.println("Result: " + result);

        result += 80 / 20 % 8 * 3 + -5;
        System.out.println("Result: " + result);

        int x = 8, y = 4, z = 2, sum = 0;
//        sum = x + --y + --z;
//        System.out.println("Sum: " + sum);

        sum = x + y-- + --z * y;
        System.out.println("Sum: " + sum);
    }
}
