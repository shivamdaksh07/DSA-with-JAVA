package Array;

import java.util.Scanner;

public class findanele {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        int e = scn.nextInt();
        System.out.println(find(arr,e));
     }
     public static int find(int arr[], int e){
         for(int  i = 0; i< arr.length -1  ; i++){
             if(arr[i] == e){
                 return i;
             }
         }
         return -1;
     }
}
