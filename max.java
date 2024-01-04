package all_files;
import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDigits = scanner.nextInt();

        int[] digits = new int[numDigits];

        for (int i = 0; i < numDigits; i++) {
            digits[i] = scanner.nextInt();
        }

        int maxNumber = findMaximumNumber(digits);
        System.out.println(maxNumber);
    }

    public static int findMaximumNumber(int[] digits) {
        int maxNumber = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > maxNumber) {
                maxNumber = digit;
            }
        }

        return maxNumber;
    }
}
