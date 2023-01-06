import java.util.*;
import java.io.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        String num = Integer.toString(n);
        int size = num.length();
        while(n>0){
            int x = n%10;
            sum = sum + (int)Math.pow(x,size);
            n /= 10;
        }
        if(sum==temp){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not a Armstrong Number");
        }
    }
}
