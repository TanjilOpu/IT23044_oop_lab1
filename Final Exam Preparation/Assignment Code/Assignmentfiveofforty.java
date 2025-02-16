package javaapplication34;

public class Assignmentfiveofforty {

    public static void main(String[] args) {
        int[] arr = {10, 12, 14, 15, 16, 18, 20};
        int result = calculatesum(arr);
        System.out.println("The sum of the array = " + result);
    }

    public static int calculatesum(int[] arr)
    {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
