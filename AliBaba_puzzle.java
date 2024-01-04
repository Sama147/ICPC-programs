package all_files;
import java.util.Scanner;

public class AliBaba_puzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        if (checkArithmeticRelation(a, b, c, d) || checkArithmeticRelation(a, c, b, d) || checkArithmeticRelation(b, c, a, d)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean checkArithmeticRelation(long a, long b, long c, long d) {
        return (a + b == d) || (a - b == d) || (a * b == d) || (a / b == d) || (b - a == d) || (b / a == d) || (b + a == d) || (b * a == d) ||
                (a + c == d) || (a - c == d) || (a * c == d) || (a / c == d) || (c - a == d) || (c / a == d) || (c + a == d) || (c * a == d) ||
                (b + c == d) || (b - c == d) || (b * c == d) || (b / c == d) || (c - b == d) || (c / b == d) || (c + b == d) || (c * b == d);
    }
}

