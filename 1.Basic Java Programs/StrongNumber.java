import java.util.*;
import java.io.*;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while(n>0){
            int x = n%10;
            sum = sum + fact(x);
            n /= 10;
        }
        if(sum==temp){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a Strong Number");
        }
    }
    public static int fact(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
}
