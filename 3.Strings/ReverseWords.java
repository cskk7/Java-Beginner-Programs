/*
  To REVERSE the WORDS int the String
 */
import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
