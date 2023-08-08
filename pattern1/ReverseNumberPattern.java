package pattern1;

import java.util.Scanner;

public class ReverseNumberPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i =1; i<=n; i++){
            int print = i;
            for(int j =1; j<=i; j++){
                System.out.print(print);
                print--;
            }
            System.out.println();
        }
        s.close();

    }
}
