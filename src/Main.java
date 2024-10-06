import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int lastDigit = (int) (n % 10);
        System.out.println(lastDigit);
    }
}