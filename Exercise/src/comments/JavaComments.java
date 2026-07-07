package comments;

public class JavaComments {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        // Prints Hello Java Developers - single line comment
        System.out.println("Hello Java Developers");

        /*
        This is a
        Multi Line comment */

        doMultiplication(3, 4);

    }

    /**
     * This method multiplies two integer values
     * @param x is the first parameter
     * @param y is the second parameter
     * @return This method returns the multiplication of the x and y
     */
    public static int doMultiplication(int x, int y) {
        return x * y;
    }
}
