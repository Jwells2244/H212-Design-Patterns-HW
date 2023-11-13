public class FactorGenerator {
    int numberToFactor;
    public FactorGenerator(int numberToFactor){
        this.numberToFactor = numberToFactor;
    }
    public void nextFactor(int n){
        System.out.println(n);
    }
    public void hasMoreFactors(){
        while (this.numberToFactor != 1){
            for (int i = 2; i<=this.numberToFactor; i++){
                if (this.numberToFactor % i ==0){
                    this.nextFactor(i);
                    this.numberToFactor = this.numberToFactor/i;
                    break;
                }
            }
        }
    }
}
