package Array;
import java.util.*;
public class digitfre {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(digit(arr, k));

    }
    public static int digit(int arr[], int k){
        int count = 0;
        for(int i = 0; i<arr.length ; i++){
            if(arr[i]==k) count++;
        }
        return count;
        
    }

    
}
