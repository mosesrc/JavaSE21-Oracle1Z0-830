package operator;

public class ConditionalOperator {
    public static void main(String[] args) {
        int num1 = 5, num2 = 8, num3 = 12;

        boolean result;

        result = (num1 > num2) && (num3 > num1);
        System.out.println("result = " + result);

        result = (num1 > num2) || (num3 > num1);
        System.out.println("result = " + result);

        result = num1 < num2 ? true : false;
        System.out.println("result = " + result);
    }
}
