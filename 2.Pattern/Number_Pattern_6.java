/*
  5 5 5 5 5
  4 4 4 4
  3 3 3
  2 2
  1
 */
import java.util.Scanner;

public class Number_Pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
