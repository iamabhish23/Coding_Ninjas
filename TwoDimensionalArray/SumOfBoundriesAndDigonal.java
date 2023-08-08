package TwoDimensionalArray;

public class SumOfBoundriesAndDigonal {

    public static int getFirstDiagonalSum(int arr[][], int dimension) {
        int currRow = 0;
        int currCol = 0;
        int diagonalSum = 0;
        while (currRow < dimension && currCol < dimension) {
            diagonalSum += arr[currRow][currCol];
            currCol++;
            currRow++;
        }
        return diagonalSum;
    }

    public static int getSecondDiagonalSum(int arr[][], int dimension) {
        int currRow = 0;
        int currCol = dimension - 1;
        int diagonalSum = 0;
        while (currRow < dimension && currCol >= 0) {
            diagonalSum += arr[currRow][currCol];
            currRow++;
            currCol--;
        }
        return diagonalSum;
    }

    public static int getBoundarySum(int arr[][], int dimension) {
        int sum = 0;
        for (int i = 1; i < dimension - 1; i++) {
            sum += arr[0][i];
            sum += arr[dimension - 1][i];
            sum += arr[i][0];
            sum += arr[i][dimension - 1];
        }
        return sum;
    }

    public static void totalSum(int[][] arr) {
        int n = arr.length;
        int sum = 0;
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        int TotalSum = getFirstDiagonalSum(arr, n) + getSecondDiagonalSum(arr, n) + getBoundarySum(arr, n);
        if (n % 2 != 0) {
            TotalSum = TotalSum - arr[n / 2][n / 2];
        }
        System.out.println(TotalSum);
    }
}
