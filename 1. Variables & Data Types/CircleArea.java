import java.util.Scanner;

public class CircleArea {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        float pie = 3.14f;
        System.out.print("Enter radius of circle: ");
        float radius = s.nextFloat();
        float area = pie * radius * radius;
        System.out.println("Area of circle is " + area);
        s.close();
    }
}
