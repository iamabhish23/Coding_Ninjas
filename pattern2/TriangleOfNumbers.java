package pattern2;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            int print = i;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i; j++) {
                System.out.print(print);
                if (j < i) {
                    print++;
                } else {
                    print--;
                }
            }
            System.out.println();
        }
        s.close();
    }
}
