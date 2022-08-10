package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class disapapprednum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(disapp(arr));
    }
    public static List<Integer> disapp(int arr[]){
        HashMap<Integer, Integer>  hm = new HashMap<>();
        for(int i = 0; i<arr.length ; i++){
            hm.put(arr[i], 1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1; i<arr.length ; i++){
            if(hm.containsKey(i)==false){
                ans.add(i);
            }
        }
        return ans;
    }
}
