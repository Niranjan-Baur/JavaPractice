package practice;

import java.util.Scanner;

public class TwoDArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // input
        // outer loop for rows
        for (int i=0 ; i<rows ; i++){
            for (int j=0 ; j<cols ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //output

        for (int i=0 ; i<rows ; i++){
            for (int j=0 ; j<cols ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
