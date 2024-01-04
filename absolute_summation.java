package all_files;
import java.util.Scanner;

public class absolute_summation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[100000];
        int size = scanner.nextInt();
        long sum = 0;

        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
            sum += A[i];
        }

        if (sum < 0) {
            System.out.println(sum * (-1));
        } else {
            System.out.println(sum);
        }
    }
}



