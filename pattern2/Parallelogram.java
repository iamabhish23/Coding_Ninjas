package pattern2;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i =0; i<n; i++){
            for(int j =0; j<i; j++){
                System.out.print(" ");
            }
            for(int k =0; k<n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();

    }
}
