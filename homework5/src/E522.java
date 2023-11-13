
import java.util.Scanner;


public class E522 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your two doubles, separated by a space: ");
        double input1 = Math.round(sc.nextDouble()*100.0)/100.0;
        double input2 = Math.round(sc.nextDouble()*100.0)/100.0;
        //Testing
        System.out.println(input1);
        System.out.println(input2);
        if (input1 == input2){
            System.out.println("They are the same");
        }
        else{
            System.out.println("They are different");
        }
    }
}
