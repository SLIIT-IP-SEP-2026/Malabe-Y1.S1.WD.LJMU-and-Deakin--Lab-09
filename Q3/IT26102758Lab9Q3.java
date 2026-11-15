public class IT26102758Lab9Q3 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {

        int result1, result2;

        // Expression 1: (3 * 4 + 5 * 7)^2

        result1 = square(add(multiply(3, 4),
                             multiply(5, 7)));

        System.out.println("Result 1: " + result1);

        // Expression 2: (4 + 7)^2 + (8 + 3)^2

        result2 = add(square(add(4, 7)),
                      square(add(8, 3)));

        System.out.println("Result 2: " + result2);
    }
}