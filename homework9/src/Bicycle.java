public class Bicycle{
    double cadence;
    int gearSize;
    public Bicycle(int gearSize, double cadence){
        this.gearSize = gearSize;
        this.cadence = cadence;
    }
    public double speed(){
        return ((double)((this.gearSize * Math.PI)/12*5280)*this.cadence*60);
    }
    public void setCadence(double cadence){
        this.cadence = cadence;
    }
    public static void main(String[] args){
        Bicycle test = new Bicycle(50, 80.0);
        System.out.println(test.speed());
        test.setCadence(60.0);
        System.out.println(test.speed());
    }
}