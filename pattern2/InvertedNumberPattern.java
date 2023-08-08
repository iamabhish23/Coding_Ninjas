package pattern2;

import java.util.Scanner;

public class InvertedNumberPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i =1; i<=n; i++){
            int print = n+1-i;
            for(int j =1; j<=n+1-i; j++){
                if(j<=n+1-i){
                    System.out.print(print);
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        s.close();
    }
}
