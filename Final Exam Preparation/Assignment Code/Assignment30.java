
package javaapplication34;
import java.util.*;
public class Assignment30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number which is greater than 20");
        int n=input.nextInt();
        if(n<20)
        {
            System.out.println("The number is less than 20");
            return;
        }
        int m = (int) Math.ceil(n/10.0);
        int[] firstarr= new int[n];
        int[] secondarr= new int[m];
        System.out.println("Enter "+n+" element for the first array");
        for(int i=0;i<n;i++)
        {
            firstarr[i]=input.nextInt();
        }
        input.nextInt();
          System.out.println("Enter "+m+" element for the second  array");
        for(int i=0;i<m;i++)
        {
            secondarr[i]=input.nextInt();
        }
        System.out.println("Division Result");
        for(int i=0;i<m;i++)
        {
            if(secondarr[i]==0)
            {
                System.out.println("The second array element is zero");
                continue;
            }
            int res=(int) Math.ceil((double)firstarr[i]/secondarr[i]);
            int rem=firstarr[i]%secondarr[i];
            System.out.println("Firstarr["+i+"] / secondarr["+i+"] is " +firstarr[i]+"/"+secondarr[i]+" = "+res+"(Ceil value)");
            System.out.println("Reminder = "+rem);
            
        }
    }
}
