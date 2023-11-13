public class Bug {
    int initialPosition;
    boolean direction;
    public Bug(int initialPosition){
        this.initialPosition = initialPosition;
        this.direction = true;
    }
    public void turn(){
        this.direction = !(this.direction);
    }
    public void move(){
        if (this.direction){
            this.initialPosition ++;
        }
        else{
            this.initialPosition --;
        }
    }
    public int getPosition(){
        return this.initialPosition;
    }
}
