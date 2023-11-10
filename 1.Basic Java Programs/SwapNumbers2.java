import java.util.*;

public class SwapNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Numbers before swapping: "+num1+","+num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Numbers after swapping: "+num1+","+num2);

    }
}
