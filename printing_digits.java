package all_files;

import java.util.Scanner;

import java.util.Scanner;

public class printing_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            if (n == 0) {
                System.out.println(n);
            } else {
                while (n > 0) {
                    System.out.print(n % 10 + " ");
                    n = n / 10;
                }
                System.out.println();
            }
        }
    }
}

