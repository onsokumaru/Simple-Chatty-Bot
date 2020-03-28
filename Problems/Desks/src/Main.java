import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int val3 = scanner.nextInt();

        val1 += (val1 % 2 == 0) ? 0 : 1;
        val2 += (val2 % 2 == 0) ? 0 : 1;
        val3 += (val3 % 2 == 0) ? 0 : 1;

        int total = val1 + val2 + val3;
        System.out.print(total / 2);
    }
}