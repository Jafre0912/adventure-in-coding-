//1.	Write a function to find out the 2nd highest number from an Array 
public class SecondHighestNum {
    public static int findSecondHighest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > max) {
                secMax = max; 
                max = n;
            } else if (n > secMax && n != max) {
                secMax = n;
            }
        }
        if (secMax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Array must contain at least two unique numbers.");
        }
        return secMax;
    }
    public static void main(String[] args) {
        int[] nums = {10,20,22,30,40,50,60};
        try {
    System.out.println("Second highest number is: " + findSecondHighest(nums));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
