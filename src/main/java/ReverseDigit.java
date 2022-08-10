import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        DigitReverse reverse = new DigitReverse();
        int result = reverse.getReverse(number);
        System.out.println(result);
    }
}
