public class IT26102621Lab9Q3 {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to find the square of a number
    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        // (3 * 4 + 5 * 7)^2
        int result1 = square(add(multiply(3, 4), multiply(5, 7)));

        // (4 + 7)^2 + (8 + 3)^2
        int result2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result of (3 * 4 + 5 * 7)^2      : " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2  : " + result2);
    }
}