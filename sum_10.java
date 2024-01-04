package all_files;

import java.util.Scanner;

public class sum_10  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();

        for (int i = 0; i < numCases; i++) {
            int[] numbers = new int[3];
            for (int j = 0; j < 3; j++) {
                numbers[j] = scanner.nextInt();
            }

            String result = checkDigitSum(numbers);
            System.out.println(result);
        }

        scanner.close();
    }

    public static String checkDigitSum(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] >= 10) {
                    return "YES";
                }
            }
        }

        return "NO";
    }
}



