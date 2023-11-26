import java.util.*;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1, c;
        for(int i = 1; i <= num; i++){
            c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}