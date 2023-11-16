/*
  A A A A A
  B B B B
  C C C 
  D D
  E
 */
import java.util.*;

public class Alphabet4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = 'A';
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }
}