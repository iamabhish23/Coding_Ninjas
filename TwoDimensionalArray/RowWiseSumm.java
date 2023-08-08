package TwoDimensionalArray;

import java.util.Scanner;

public class RowWiseSumm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t != 0) {
            int rows = s.nextInt();
            int columns = s.nextInt();
            int arr[][] = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    arr[i][j] = s.nextInt();
                }
            }
            System.out.println();
            int ans[] = new int[rows];
            calculateAndPrintSum(arr, ans);
            System.out.println();
            t--;
        }
        s.close();
    }

    private static void calculateAndPrintSum(int arr[][], int[] ans) {
        int rows = arr.length;
        int columns = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                ans[i] += arr[i][j];
            }
        }
        printArray(ans);
    }

    private static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
