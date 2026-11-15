

public class IT26102758Lab9Q2 {

    public static double circleArea(double radius) {

        double area = Math.PI * Math.pow(radius, 2);

        return area;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radius, area;

        System.out.print("Enter radius: ");
        radius = input.nextDouble();

        area = circleArea(radius);

        System.out.printf("Area of circle: %.2f%n", area);

        input.close();
    }
}