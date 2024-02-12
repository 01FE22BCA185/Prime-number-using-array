/**
 * The Prime class checks if a given number is prime or not.
 */
import java.util.Scanner;

public class Prime{

  /**
   * The function checks if a given number is prime or not.
   * 
   * @param number The parameter "number" is an integer that we want to check if it is a prime number.
   * @return The method isPrime is returning a boolean value. It returns true if the given number is
   * prime, and false otherwise.
   */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

// The code snippet is the main method of the program. It prompts the user to enter the starting and
// ending numbers of a range. It then calls the `isPrime` function for each number in the range and
// prints the prime numbers.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers in the range [" + start + ", " + end + "]:");
    // The code snippet is a loop that iterates through each number in the range from `start` to `end`.
    // For each number `i`, it calls the `isPrime` function to check if `i` is a prime number. If
    // `isPrime(i)` returns true, it means that `i` is a prime number, so it prints `i` followed by a
    // space. Finally, it closes the scanner object.
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
