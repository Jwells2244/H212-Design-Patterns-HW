import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fold1=1, fold2=1, fnew, input;
        System.out.println("Enter your number that you want fibonacci sequenced: ");
        input = sc.nextInt();
        fnew = 1;
        //If you count the zero
        for (int i = 3; i < input; i++){
            fold2 = fold1;
            fold1 = fnew;
            fnew = fold1+fold2;
            //Testing:
            System.out.println(fnew);
        }
        System.out.println("The " + input + "th number in the fibonacci sequence is: " + fnew);
    }
}
