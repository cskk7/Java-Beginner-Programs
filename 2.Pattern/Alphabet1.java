/*
  A A A A A
  B B B B B
  C C C C C
  D D D D D
  E E E E E
 */
import java.util.*;
public class Alphabet1{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      char ch = 'A';
      for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n; j++){
            System.out.print(ch+" ");
        }
        ch++;
        System.out.println();
      }
    }
}