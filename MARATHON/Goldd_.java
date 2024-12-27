
package goldd_;


import java.util.Scanner;

public class Goldd_ {
    static boolean solve(long n, long m) {
        if (n == m) {
            return true; // Base case: If n equals m, we found the target.
        }
        if (n < m || n % 3 != 0) {
            return false; // If n is less than m or n cannot be divided by 3, it's impossible.
        }

        long n1 = n / 3;
        long n2 = 2 * n / 3;

        // Recursively check both splits
        return solve(n1, m) || solve(n2, m);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt(); // Number of test cases

        while (tc-- > 0) {
            long n = scanner.nextLong();
            long m = scanner.nextLong();

            if (n == m) {
                System.out.println("YES");
            } else if (n % 3 != 0 || n < m) {
                System.out.println("NO");
            } else {
                boolean res = solve(n, m);
                if (res) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

        scanner.close();
    }
}

