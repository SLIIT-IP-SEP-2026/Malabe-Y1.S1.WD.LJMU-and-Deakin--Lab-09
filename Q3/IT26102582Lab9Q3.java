public class IT26102582Lab9Q3 {
    public static int add(int number1, int number2) {

        int answer = number1 + number2;
        return answer;
    }

    public static int multiply(int number1, int number2) {

        int answer = number1 * number2;
        return answer;
    }

    public static int square(int number) {

        int answer = number * number;
        return answer;
    }

    public static void main(String[] args) {

        int result1 = square(add(multiply(3, 4), multiply(5, 7)));

        int result2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result of (3 * 4 + 5 * 7)²    : " + result1);

        System.out.println("Result of (4 + 7)² + (8 + 3)² : " + result2);
    }
}