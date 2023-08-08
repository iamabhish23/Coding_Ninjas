package pattern2;

import java.util.Scanner;

public class OddSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i =0; i<n; i++){
            int print =i;
            for(int j =0; j<n; j++){
                if(print<n){
                    System.out.print(2*print+1 + " ");
                    print++;
                }else{
                    System.out.print(2*(print-n)+1 + " ");
                    print++;   
                }
                
            }
            System.out.println();
        }
    }
}
