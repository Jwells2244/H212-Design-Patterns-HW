import java.util.ArrayList;
import java.util.Random;

public class sevenPone {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i<20; i++){
            list.add(rand.nextInt(5)+1);
        }
        boolean inRun = false;
        for (int x = 0; x < list.size(); x++){
            if (inRun){
                if (list.get(x) != list.get(x-1)){
                    System.out.print(" ) ");
                    inRun = false;
                }
            }
            if (!inRun && x!=19){
                if (list.get(x) == list.get(x+1)){
                    System.out.print(" ( ");
                    inRun = true;
                }
            }
            System.out.print(" " + list.get(x) + " ");
        }
        if (inRun){
            System.out.print(" ) ");
        }
    }
}
