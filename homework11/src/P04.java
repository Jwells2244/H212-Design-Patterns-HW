import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
public class P04 {
    public static boolean isPalindrome(int n) {//Checks to see if the number is a palindrome by reversing it
        String s = String.valueOf(n);
        int len = s.length();

        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        int[] squarePalindromes = IntStream.iterate(0, i -> i + 1) //Fills the square Palindromes array
                .map(i -> i * i) //Applies i multiplying itself
                .filter(P04::isPalindrome)
                .limit(n)
                .toArray();

        System.out.println(Arrays.toString(squarePalindromes));

        int[] primePalindromes = (new PrimeGenerator()).stream() //Makes a new primeGenerator object
                .filter(P04::isPalindrome) //Checks if it is a palindrome
                .limit(n)
                .toArray();

        System.out.println(Arrays.toString(primePalindromes));
    }
}