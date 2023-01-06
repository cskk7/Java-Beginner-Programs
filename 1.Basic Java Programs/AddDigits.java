/*
 Write a code to find the sum of digits in an integer
 */
import java.util.*;

public class AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        while(number > 0){
            int x = number % 10;
            sum += x;
            number /= 10;
        }
        System.out.println(sum);
    }
}
