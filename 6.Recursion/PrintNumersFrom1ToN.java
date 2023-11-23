public class PrintNumersFrom1ToN {

    public static void main(String[] args) {
        printNumbers(1, 5);
    }

    // Recursive method to print numbers from start to end
    public static void printNumbers(int start, int end) {
        if (start <= end) {
            System.out.println(start);
            printNumbers(start + 1, end);

        }
    }
}
