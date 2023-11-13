import java.util.ArrayList;
import java.util.Scanner;

public class sevenPfive2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 16 numbers: ");
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[][] list = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        for (int y = 0; y < 16; y++) {
            values.add(sc.nextInt());
        }
        int valI = 0;
        for (int i = 0; i < 4; i++) {
            for (int x = 0; x < 4; x++) {
                list[i][x] = values.get(valI);
                valI++;
            }
        }
        int flag = 0;
        for (int i = 1; i < 17; i++) {
            if (!values.contains(i)) {
                flag = 1;
            }
        }
        if (flag == 0) {
            if (list[0][0] + list[0][1] + list[0][2] + list[0][3] == 34) {
                if (list[1][0] + list[1][1] + list[1][2] + list[1][3] == 34) {
                    if (list[2][0] + list[2][1] + list[2][2] + list[2][3] == 34) {
                        if (list[3][0] + list[3][1] + list[3][2] + list[3][3] == 34) {
                            if (list[0][0] + list[1][0] + list[2][0] + list[3][0] == 34) {
                                if (list[0][1] + list[1][1] + list[2][1] + list[3][1] == 34) {
                                    if (list[0][2] + list[1][2] + list[2][2] + list[3][2] == 34) {
                                        if (list[0][3] + list[1][3] + list[2][3] + list[3][3] == 34) {
                                            if (list[0][0] + list[1][1] + list[2][2] + list[3][3] == 34) {
                                                if (list[0][3] + list[1][2] + list[2][1] + list[3][0] == 34) {
                                                    System.out.println("Square Works!");
                                                } else {
                                                    System.out.println("Square does not work");
                                                }
                                            } else {
                                                System.out.println("Square does not work");
                                            }
                                        } else {
                                            System.out.println("Square does not work");
                                        }
                                    } else {
                                        System.out.println("Square does not work");
                                    }
                                } else {
                                    System.out.println("Square does not work");
                                }
                            } else {
                                System.out.println("Square does not work");
                            }
                        } else {
                            System.out.println("Square does not work");
                        }
                    } else {
                        System.out.println("Square does not work");
                    }
                } else {
                    System.out.println("Square does not work");
                }
            } else {
                System.out.println("Square does not work");
            }
        } else {
            System.out.println("Incorrect Values!");
        }
    }
}
