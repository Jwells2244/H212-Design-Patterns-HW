import java.util.Scanner;

public class dataSetTester {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to add to the list: ");
        int length = sc.nextInt();
        double[] testList = new double[length];
        for (int i = 0; i < length; i ++){
            System.out.println("Enter a double to add to the list: ");
            testList[i] = sc.nextDouble();
        }
        DataSet test = new DataSet(testList);
        System.out.println("The average of your data set is " + test.getAverage());
        System.out.println("The standard deviation of your data set is " + test.getStandardDeviation());
    }
}
