//Reading highest value of a series from a file and writing the sum into another file
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainJava {
    public static void main(String[] args) {
        try{
            File file= new File("Input.txt");
            Scanner scanf= new Scanner(file);
            PrintWriter printf=new PrintWriter(new File("Output 2.txt"));
            if(scanf.hasNextLine()){
                String x =scanf.nextLine();
                String[] s= x.split(",");
                for(int i=0;i<s.length;i++){
                    int n= Integer.parseInt(s[i]);
                    //System.out.println(n);
                    int ssum=(n*(n+1))/2;
                    printf.print(ssum);
                    if(i!=s.length-1)
                    printf.print(", ");
                }
            }
            scanf.close();
            printf.close();
            System.out.println("File written successfully");
        }
        catch(Exception e){
            System.out.println("File not found");
        }
    }
}
//Md Shihabul Islam(IT23033)