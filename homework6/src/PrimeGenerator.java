public class PrimeGenerator {
    int number;
    public PrimeGenerator(int number){
        this.number = number;
    }
    public void nextPrime(int n){
        System.out.println(n);
    }
    public void isPrime(){
        for (int i = 2; i < this.number; i++){
            for (int j = 2; j <= i; j++){
                if (i%j == 0){
                    if (i==j){
                        nextPrime(i);
                        break;
                    }
                    else{
                        break;
                    }
                }
            }
        }
    }
}
