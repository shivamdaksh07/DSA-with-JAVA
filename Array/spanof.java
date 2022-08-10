package Array;

import java.util.Scanner;

public class spanof {
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
    System.out.print(span(arr));
   }
    /**
    * @param arr
    * @return
    */
   public static int span(int arr[]){
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int ans = max - min;
    for(int v : arr){
      if(v > max){
         max = v;
      }
      if(v < min){
         min = v;
      }
      
    }
    return max - min;
   }
    
}
