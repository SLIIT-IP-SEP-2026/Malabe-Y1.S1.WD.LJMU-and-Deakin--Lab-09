public class IT26102619Lab9Q3 {
	public static void main(String[] args) {
	
        int result1 = square(add(multiply(3, 4), multiply(5, 7)));
        int result2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result of (3 * 4 + 5 * 7)^2 : " + result1);
        System.out.println("Result of (4 + 7)² + (8 + 3)^2 : " + result2);
    }

    public static int add(int value1, int value2) {
        return value1 + value2;
    }

    public static int multiply(int value1, int value2) {
        return value1 * value2;
    }

    public static int square(int value) {
        return value * value;
    }
}