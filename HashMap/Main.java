package HashMap;

import java.util.*;

public class Main {

    /**
     * @param arr
     * @return
     */
    public static boolean solution(int[] arr) {
        HashSet<Integer>hash = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length ; j++){
                final int su =  arr[i]+arr[j];
                if(hash.contains(su)){
                    return true;
                }else{
                hash.add(su);
            }
        }
        }

        return false;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }

}
