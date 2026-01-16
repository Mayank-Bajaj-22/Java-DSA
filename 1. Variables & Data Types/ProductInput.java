import java.util.Scanner;

public class ProductInput {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = s.nextInt();
        System.out.print("Enter value of b: ");
        int b = s.nextInt();
        int product = a * b;
        System.out.println("Product of a and b is " + product);
        s.close();
    }
}
