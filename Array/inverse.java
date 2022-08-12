package Array;

import java.util.Scanner;

public class inverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = scn.nextInt();
        }
        int[] inv = invers(arr);
        display(inv);
        
      
    }
    public static void display(int[] arr){
        StringBuilder sb = new StringBuilder();
    
        for(int val: arr){
          sb.append(val + " ");
        }
        System.out.println(sb);
      }
    public static int[] invers(int arr[]){
        int arr2[] = new int[arr.length];
        for(int i = 0; i<arr.length ; i++){
        int v = arr[i];
        arr[2] = i;

    }
        return arr2;
}

}
