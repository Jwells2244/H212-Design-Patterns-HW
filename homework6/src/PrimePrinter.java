import java.util.Scanner;
public class PrimePrinter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to see the prime numbers less than it: ");
        int input = sc.nextInt();
        PrimeGenerator test = new PrimeGenerator(input);
        test.isPrime();
    }
}
