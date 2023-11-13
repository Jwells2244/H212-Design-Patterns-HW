import java.util.ArrayList;
import java.util.Scanner;

public class sevenPfive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 16 numbers: ");
        ArrayList<Integer> values = new ArrayList<Integer>();
        for (int y = 0; y<16; y++){
            values.add(sc.nextInt());
        }
        int flag = 0;
        for (int i = 1; i<17; i++){
            if (!values.contains(i)){
                flag = 1;
            }
        }
        if (flag == 0){
            if (values.get(0) + values.get(1) + values.get(2) + values.get(3) == 34){
                if (values.get(4) + values.get(5) + values.get(6) + values.get(7) == 34){
                    if (values.get(8) + values.get(9) + values.get(10) + values.get(11) == 34){
                        if (values.get(12) + values.get(13) + values.get(14) + values.get(15) == 34){
                            if (values.get(0) + values.get(4) + values.get(8) + values.get(12) == 34){
                                if (values.get(1) + values.get(5) + values.get(9) + values.get(13) == 34){
                                    if (values.get(2) + values.get(6) + values.get(10) + values.get(14) == 34){
                                        if (values.get(3) + values.get(7) + values.get(11) + values.get(15) == 34){
                                            if (values.get(0) + values.get(5) + values.get(10) + values.get(15) == 34){
                                                if (values.get(3) + values.get(6) + values.get(9) + values.get(12) == 34){
                                                    System.out.println("Square is correct!");
                                                }
                                                else{
                                                    System.out.println("Square does not work");
                                                }
                                            }
                                            else{
                                                System.out.println("Square does not work");
                                            }
                                        }
                                        else{
                                            System.out.println("Square does not work");
                                        }
                                    }
                                    else{
                                        System.out.println("Square does not work");
                                    }
                                }
                                else{
                                    System.out.println("Square does not work");
                                }
                            }
                            else{
                                System.out.println("Square does not work");
                            }
                        }
                        else{
                            System.out.println("Square does not work");
                        }
                    }
                    else{
                        System.out.println("Square does not work");
                    }
                }
                else{
                    System.out.println("Square does not work");
                }
            }
            else{
                System.out.println("Square does not work");
            }
        }
        else{
            System.out.println("Incorrect values entered!");
        }

    }
}
