import java.util.ArrayList;
import java.util.Random;

public class montyHall {
    public static void main(String[] args){
        Random ran = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int strategy1 = 0, strategy2 = 0;
        int userdoor, correctdoor, hostdoor = -2;
        for (int i = 0; i <1000; i++){
            userdoor = ran.nextInt(list.size())+1;
            correctdoor = ran.nextInt(list.size())+1;
            while (hostdoor != userdoor && hostdoor != correctdoor){
                hostdoor = ran.nextInt(list.size())+1;
            }
            //strategy 1
            if (userdoor != correctdoor){
                strategy1 ++;
            }
            //strategy 2
            else if (userdoor == correctdoor){
                strategy2 ++;
            }
        }
        System.out.println("After 1000 iterations, strategy 1 was correct " + strategy1 + " times, while strategy 2 was correct " + strategy2 + " times");
    }
}
