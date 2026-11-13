public class IT26102722Lab9Q3 {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        // i. (3 * 4 + 5 * 7)^2
        int part1 = multiply(3, 4);
        int part2 = multiply(5, 7);
        int sum1 = add(part1, part2);
        int result1 = square(sum1);

        // ii. (4 + 7)^2 + (8 + 3)^2
        int sq1 = square(add(4, 7));
        int sq2 = square(add(8, 3));
        int result2 = add(sq1, sq2);

        System.out.println("Result of (3 * 4 + 5 * 7)²   : " + result1);
        System.out.println("Result of (4 + 7)² + (8 + 3)² : " + result2);
    }
}
