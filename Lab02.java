// Reading values from a file, calculating the sum from 1 to each value, and writing the results into another file
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        try {
            File file = new File("Input.txt");
            Scanner scanf = new Scanner(file);

            PrintWriter printf = new PrintWriter(new File("Output.txt"));

            if (scanf.hasNextLine()) {
                String x = scanf.nextLine();
                String[] s = x.split(",");
                for (int i = 0; i < s.length; i++) {
                    int n = Integer.parseInt(s[i]);  
                    int sum = (n * (n + 1)) / 2;    
                    printf.print(sum);
                    if (i != s.length - 1) {
                        printf.print(", ");
                    }
                }
            }
            scanf.close();
            printf.close();
            System.out.println("File written successfully");

        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
// Md. Tanjil Islam Opu (it23044)
