package Array;

import java.util.Scanner;
// using kadne's algo
public class maxsumofsubarr {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(max(arr));
    }
    public static int max(int arr[]){
        int max = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i = 0; i<arr.length ; i++){
            currsum += arr[i];
            if(currsum > max){
                max = currsum;
            }
            if(currsum < 0){
                currsum = 0;
            }
        }
        return max;
    }
}
