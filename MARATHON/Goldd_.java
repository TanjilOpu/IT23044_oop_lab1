
package goldd_;
          // CODEFORCES GOLD RUSH PROBLEM SOLVE WITH JAVA
import java.util.Scanner;

public class Goldd_ {
    static boolean solve(long n, long m) {
        if (n == m) {
            return true; 
        }
        if (n < m || n % 3 != 0) {
            return false; 
        }

        long n1 = n / 3;
        long n2 = 2 * n / 3;


        return solve(n1, m) || solve(n2, m);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
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


