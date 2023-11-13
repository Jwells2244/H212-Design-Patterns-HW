import java.util.Scanner;

public class FactorPrinter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to be factored: ");
        int input = sc.nextInt();
        FactorGenerator test = new FactorGenerator(input);
        test.hasMoreFactors();
    }
}
