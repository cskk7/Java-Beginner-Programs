import java.util.*;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = add(num);
        System.out.println(ans);
    }
    static int add(int n){
        if(n == 0){
            return 0;
        }
        return n + add(n - 1);
    }
}
