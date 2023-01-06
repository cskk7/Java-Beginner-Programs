import java.util.*;
import java.io.*;

class CheckPrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("It is prime number.");
        }else{
            System.out.println("It is not a prime number."); 
        }
    }
}