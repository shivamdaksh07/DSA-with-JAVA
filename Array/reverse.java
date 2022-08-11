package Array;

import java.io.*;
import java.util.*;

public class reverse{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void revers(int[] a){
     int left = 0;
     int right = a.length -1 ;
     while(left < right){
       int temp = a[left];
       a[left] = a[right];
       a[right] = temp;
       left ++;
       right --;
     }
    }

  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    revers(a);
    display(a);
 }

}