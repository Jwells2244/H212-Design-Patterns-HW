public class DataSet {
    double[] list;
    public DataSet(double[] list){
        this.list = list;
    }
    public double getAverage(){
        double average = 0.0;
        int i;
        for (i = 0; i <this.list.length; i++){
            average += this.list[i];
        }
        return average/i;
    }
    public double getStandardDeviation(){
        int n = list.length;
        double average = this.getAverage();
        double squaredDifferences = 0.0;
        for (int i = 0; i < n; i++){
            squaredDifferences += Math.pow(this.list[i]-average, 2);
        }
        return Math.sqrt(squaredDifferences/n);
    }
}
