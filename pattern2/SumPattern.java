package pattern2;

import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i =1; i<=n; i++){
            int print =1;
            int ans = print;
            System.out.print(print);
            print++;
            for(int j = 1; j<i; j++){
                System.out.print("+"+print);
                ans+=print;
                print++;
            }
            System.out.print("="+ans);
            System.out.println();
        }
        s.close();
    }
}
