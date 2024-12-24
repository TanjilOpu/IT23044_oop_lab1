
package random;

import java.util.Scanner;
import java.util.Random;


public class RandomNumberG {
    public static int generaterandom(int lower,int upper){
      Random random = new Random();
        return random.nextInt(upper-lower+1)+lower;
      
    }
      
        public static double generaterandom(double lower, double upper) {
        Random random = new Random();
        return lower + (upper - lower) * random.nextDouble();
        }
         public static float generaterandom(float lower, float upper) {
        Random random = new Random();
        return lower + (upper - lower) * random.nextFloat();
        }


  
    public static void main(String[] args) {
        System.out.println("Enter your integer range ");
        System.out.print("Upper range    = ");
        Scanner input = new Scanner(System.in);
        int upper = input.nextInt();
        System.out.print("Lower range   = ");
        int lower = input.nextInt();
        
        int randomInt = RandomNumberG.generaterandom(lower,upper);
        System.out.println("Random Integer: "+randomInt);
        
         System.out.println("Enter your double range ");
        System.out.print("Upper range    = ");
        
        double upper_d = input.nextDouble();
        System.out.print("Lower range   = ");
       double lower_d = input.nextDouble();
        
        double randomDouble = RandomNumberG.generaterandom(lower_d,upper_d);
        System.out.println("Random Double: "+randomDouble);
        
         System.out.println("Enter your float range ");
        System.out.print("Upper range    = ");
        float upper_f = input.nextFloat();
        System.out.print("Lower range   = ");
        float lower_f = input.nextFloat();
        float randomFloat = RandomNumberG.generaterandom(lower_f,upper_f);
        System.out.println("Random Float: "+randomFloat);
     }
    
}
