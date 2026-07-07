package numbers;

public class JavaNumbers {
    public static void main(String[] args) {
        // Octal
        // octal numbers: 0-7
        int octalNumber1 = 015;
        int octalNumber2 = 0104;
        int sumOctalNums = octalNumber1 + octalNumber2;
        System.out.println("octalNumber1 in decimal: " + octalNumber1);
        System.out.println("octalNumber2 in decimal: " + octalNumber2);
        System.out.println("Result in decimal: " + sumOctalNums);
        System.out.println("result as octal: " + Integer.toOctalString(sumOctalNums));

        System.out.println("\n-------------------- Hexadecimal Numbers -------------------");
        // Hexadecimal
        // 0-9 A-F
        int hexNum1 = 0x1B0; // 432 in decimal
        int hexNum2 = 0X2f;
        int sumHexNums = hexNum1 + hexNum2;

        System.out.println("hexNum1 in decimal: " + hexNum1);
        System.out.println("hexNum2 in decimal: " + hexNum2);
        System.out.println("Result in decimal: " + sumHexNums);
        System.out.println("result as hexadecimal: " + Integer.toHexString(sumHexNums));

        System.out.println("\n-------------------- Binary Numbers -------------------");
        // Binary
        int binaryNum1 = 0b1001;
        int binaryNum2 = 0B1011;
        int sumBinaryNum = binaryNum1 + binaryNum2;

        System.out.println("binaryNum1 in decimal: " + binaryNum1);
        System.out.println("binaryNum2 in decimal: " + binaryNum2);
        System.out.println("Result in decimal: " + sumBinaryNum);
        System.out.println("result as binary: " + Integer.toBinaryString(sumBinaryNum));
    }
}
