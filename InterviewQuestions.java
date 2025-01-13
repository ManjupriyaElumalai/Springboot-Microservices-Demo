package InteractionInterviewQuestions;
import java.util.Arrays;
import java.util.OptionalDouble;
 
public class InterviewQuestions {
 
    /**
     * Sums all values in the array
     */
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
 
    /**
     * Gets the average of all values in the array
     */
    public static double average(int[] numbers) {
        OptionalDouble result = Arrays.stream(numbers).average();
        return result.orElse(0); // Return 0 if the array is empty
    }
 
    /**
     * Returns the array in reverse order
     */
    public static int[] reverse(int[] numbers) {
        int[] reversedArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedArray[i] = numbers[numbers.length - 1 - i];
        }
        return reversedArray;
    }
 
    /**
     * Returns true if a string is the same forward as it is backwards
     */
    public static boolean isPalindrome(String value) {
        int start = 0;
        int end = value.length() - 1;
        while (start < end) {
            if (value.charAt(start) != value.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
 
    public static void main(String[] args) {
        var intArray = new int[]{1, 2, 3, 4, 5};
 
        // Output: 15
        System.out.println("Sum: " + sum(intArray));
 
        // Output: 3.0
        System.out.println("Average: " + average(intArray));
 
        // Output: [5, 4, 3, 2, 1]
        System.out.println("Reversed: " + Arrays.toString(reverse(intArray)));
 
        // Output: true
        System.out.println("Is 'racecar' a palindrome? " + isPalindrome("racecar"));
 
        // Output: false
        System.out.println("Is 'hello' a palindrome? " + isPalindrome("hello"));
    }
}