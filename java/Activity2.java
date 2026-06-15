package fst;

public class Activity2 {
    public static void main(String[] args) {
        
        int[] arr = {10, 77, 10, 54, -11, 10};
        System.out.println("Result: " + result(arr));
        
    }

	static boolean result(int[] arr) {
        int sum = 0;
        
        for (int number : arr) {
            if (number == 10) {
                sum += number;
            }
        }

        if (sum == 30) {
        	return true;
        }
     
        return false;
    }
}