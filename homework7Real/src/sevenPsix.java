import java.util.Scanner;

public class sevenPsix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your list, has to be odd: ");
        int size = sc.nextInt();
        int[][] array = new int[size][size];

        int number = 1;
        int row = 0;
        int column = size / 2;
        int currRow;
        int currCol;
        while (number <= size *size){
            array[row][column] = number;
            currRow = row;
            currCol = column;
            row --;
            column ++;
            if (row == -1){
                row = size - 1;
            }
            if (column == size){
                column = 0;
            }
            if (array[row][column] != 0){
                row = currRow +1;
                column = currCol;
                if (row == -1){
                    row = size -1;
                }
            }
            number++;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
