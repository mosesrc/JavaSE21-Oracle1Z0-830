package operator;

public class ArithmeticOperator {
    public static void main(String[] args) {

        double num1 = 8.4, num2 = 4.2, result = 0.0;
        result = num1 + num2;
        System.out.println("num1 + num2 = " + result);

        result = num1 * num2;
        System.out.println("num1 * num2 = " + result);

        result = num1 - num2;
        System.out.println("num1 - num2 = " + result);

        result = num1 / num2;
        System.out.println("num1 / num2 = " + result);

        result = num1 % num2;
        System.out.println("num1 % num2 = " + result);

        String str1 = "Java ";
        String str2 = "Programing";
        String str3 = str1 + str2;

        System.out.println("str3 = " + str3);
    }
}
