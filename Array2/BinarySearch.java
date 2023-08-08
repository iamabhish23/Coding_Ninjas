package Array2;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]= new int[n];
        for(int i =0; i<n; i++){
            arr[i]=s.nextInt();
        }
        int k = s.nextInt();
        System.out.println(Search(arr,0,n,k));

    }

    private static int Search(int[] arr, int start, int end, int target) {
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]== target){
                return mid;  
            }else if(arr[mid]<target){
                start = mid+1;

            }else{
                end = mid-1; 
            }

        }
        return -1;
        
    }
}
