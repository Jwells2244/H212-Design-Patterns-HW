import java.util.Random;

class Zombie {
    public enum Direction { North, East, South, West };
    private int x, y;
    public Zombie() { this.x = 0; this.y = 0; }
    public void move(Direction d) {
        switch (d) {
            case North: this.x += 1; break;
            case East: this.y += 1; break;
            case South: this.x -= 1; break;
            case West: this.y -= 1; break;
        } }
    public int getX() { return x; }
    public int getY() { return y; }
    static void g(int x, Zombie z) {
        x = 5;
        z.move(Zombie.Direction.North);
    }

    public static void main(String[] args){
        Zombie test = new Zombie();
        Random rand = new Random();
        for (int x = 0; x<10;x++){
            int tes = rand.nextInt(1,5);
            if (tes == 1){
                test.move(Direction.North);
            }
            else if (tes == 2){
                test.move(Direction.East);
            }
            else if (tes == 3){
                test.move(Direction.South);
            }
            else if (tes == 4){
                test.move(Direction.West);
            }
        }
        System.out.println("(" + test.getX() + ", " + test.getY() + ")");

        int a = 0;
        Zombie z = new Zombie();
        g(a, z);
        System.out.println(a);
        System.out.println(z.getX());
    }
}