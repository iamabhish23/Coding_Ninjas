package pattern2;

import java.util.Scanner;

public class MirrorImageNumberPattern{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i<=n; i++){
            int print = 1;
            for(int j =1; j<=n; j++){
                if(j<=n-i){
                    System.out.print(" ");
                }else{
                    System.out.print(print);
                    print++;
                }    
                
            }
            System.out.println();
        }
        s.close();
    }
}