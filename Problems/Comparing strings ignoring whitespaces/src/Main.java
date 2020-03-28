import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        System.out.println(s1.replaceAll("\\s","").trim().equals(s2.replaceAll("\\s","").trim()));
    }
}