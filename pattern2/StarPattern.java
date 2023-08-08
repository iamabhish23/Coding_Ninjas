package pattern2;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i =0; i<n; i++){
            for(int j =0; j<n-1-i; j++){
                System.out.print(" ");
            }
            for(int j =0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}
