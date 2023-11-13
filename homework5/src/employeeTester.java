//E3.11

public class employeeTester {
    public static void main(String[] args){
        Employee phil = new Employee("phil", 50000);
        System.out.println("This employees name is " + phil.getName());
        System.out.println("This employees salary is " + phil.getSalary());
        System.out.println("We're going to give phil a 10% raise");
        phil.raiseSalary(10);
        System.out.println("Now " + phil.getName() + "'s salary is " + phil.getSalary());
    }
}

