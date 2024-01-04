package all_files;
import java.util.Scanner;

public class sub_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; ++i) {
            arr[i] = scanner.nextInt();
        }

        int l = scanner.nextInt();
        int r = scanner.nextInt();
        for (int i = l; i <= r; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}


