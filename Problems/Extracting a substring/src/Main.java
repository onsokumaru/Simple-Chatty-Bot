import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        int begin = scan.nextInt();
        int end = scan.nextInt();
        System.out.println(s1.substring(begin,end + 1));
    }
}