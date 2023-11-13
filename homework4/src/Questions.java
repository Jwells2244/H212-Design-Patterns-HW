


public class Questions {
    //Pseudocode for R 1.19
    //Need a function that can take in 3 things. A number, a, A guess, g, a counter to say when its been close for 2 times
    // and a precision that checks whether the guess
    //is close enough. So you first compare the guess that the program is given and the Math.sqrt(a), with the given
    //precision to see if its close enough. If it is, check the counter to check if the counter is set to 0 or 1. If its
    //0, then set it to 1, and call the function once more with function(a, (g+a/g)/2,1,precision), and it will probably
    //be close enough then, and then you can return the guess that time.
    //If it initially wasn't close the first time, you call the function again with the function(a, (g+g/a)/2, 0, precision
    //and this will recursively go through until it finds the correct guess within the given precision twice in a row



    //R 1.14
    //Yes there are values, any starting value that with the 6% yearly interest is greater than 6000+that starting
    //amount will never terminate, because the account will be gaining money, even if college takes 500 each month, the
    //starting amount + interest is too high to lose any money
    //You could fix this by implementing a break statement to say if the money goes over double the initial amount, break
    //out of this algorithm.


    //P 1.1
    public static void P(double fuelEfficiency, int distanceToWork, int trainPrice){
        int gasCost = 4;
        double maintenance = .05;
        double totalCost;
        totalCost = ((distanceToWork/fuelEfficiency)*gasCost) + maintenance*distanceToWork;
        if (trainPrice > totalCost){
            System.out.println("The driving is cheaper than the train, with the driving costing " + (totalCost));
        }
        else{
            System.out.println("The train is cheaper than the driving with the driving costing " + (totalCost) + " and the train costing " + (trainPrice));
        }
    }


    public static void main(String[] args){
        P(25.4, 45, 40);
    }
}