import java.util.*;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = add(num);
        System.out.println(ans);
    }
    static int add(int n){
        if(n == 0){
            return sum;
        }
        int sum = add(n - 1);
    }
}
