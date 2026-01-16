import java.util.*;

public class Input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // String input = sc.next();  // for single word input
        // System.out.println(input);

        String name = sc.nextLine(); // for paragraph input 
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);

        float price = sc.nextFloat();
        System.out.println(price);

        boolean m = sc.nextBoolean();
        System.out.println(m);
        sc.close();
    }
}
