import java.util.*;

public class SumInput {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = s.nextInt();
        System.out.print("Enter value of b: ");
        int b = s.nextInt();
        int sum = a + b;
        System.out.println("Sum of a and b is " + sum);
        s.close();
    }
}
