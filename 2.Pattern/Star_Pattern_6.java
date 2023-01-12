/*
           *
         * *
       * * *
     * * * *
   * * * * *
 */

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;
import javax.swing.text.StyleConstants;

public class Star_Pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i - 1; j--){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
