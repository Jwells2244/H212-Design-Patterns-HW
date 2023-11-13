import java.util.Scanner;

public class gradeTester {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        double input = sc.nextDouble();
        Grade grade = new Grade(input);
        System.out.println(grade.getAlphabeticGrade());
    }
}
