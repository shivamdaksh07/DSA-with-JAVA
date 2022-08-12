package Array;

import java.util.Scanner;

public class rotatearray {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i  = 0 ; i<n ; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        rotate(arr, k);
        display(arr);
        
        }
        /**
         * @param arr
         */
        public static void display(int arr[]){
            for(int v1 : arr){
                System.out.print(v1+ " ");
            }
        }
        public static void reverse(int arr[],int left , int right){
            //  left = 0;
            //  right = arr.length -1;
            while(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left ++;
                right--;   
            }
    }
    /**
     * @param arr
     * @param k
     */
    public static void rotate(int arr[], int k){
        k = k % arr.length;
        if(k < 0){
            k = k + arr.length;
        }
        reverse(arr,arr.length - k, arr.length -1); // part 2;

        reverse(arr,0,arr.length -k -1); // part 1;

        reverse(arr,0, arr.length -1);

        

    }
}
