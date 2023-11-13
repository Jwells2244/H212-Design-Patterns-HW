public class bugTester {
    public static void main(String[] args){
        Bug bugs = new Bug(15);
        System.out.println("This bugs initial position is " + bugs.getPosition());
        System.out.println("We are going to turn him, make him move 3 times, then turn him, make him move twice, then turn him and make him move 5 times.");
        System.out.println("His final position should be 9");
        bugs.turn();
        bugs.move();
        bugs.move();
        bugs.move();
        bugs.turn();
        bugs.move();
        bugs.move();
        bugs.turn();
        bugs.move();
        bugs.move();
        bugs.move();
        bugs.move();
        bugs.move();
        System.out.println("Bugs final position is " + bugs.getPosition());
    }
}
