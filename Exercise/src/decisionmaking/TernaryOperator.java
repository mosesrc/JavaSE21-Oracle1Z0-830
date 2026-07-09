package decisionmaking;

public class TernaryOperator {
    public static void main(String[] args) {
        int score = 80;
        String result;

        result = score > 50 ? "You passed the exam" : "You failed the exam";
        System.out.println("Result: " + result);

        int a = 10, b= 9;
        int c = a == b ? a++ : b--;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
    }
}
