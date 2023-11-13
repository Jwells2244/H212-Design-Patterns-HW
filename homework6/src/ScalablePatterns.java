public class ScalablePatterns {
    int scale;
    public ScalablePatterns(int scale){
        this.scale = scale;
    }
    public void printPattern(){
        for (int line = 0; line < this.scale; line++){
            for (int col = 0; col<this.scale; col++){
                if ((line == col) || (col == this.scale/2) || (line == this.scale/2) || (line+col == this.scale/2) || (line-col == this.scale/2) || (col-line==this.scale/2) || (line+col == this.scale) || (line+col == this.scale+(this.scale/2))){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
