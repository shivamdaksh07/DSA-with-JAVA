package Array;

public class singlenumber {
    /**
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int xor = 0;
         for(int n : nums){
             xor = xor ^ n;
         }
         return xor;
     }
}
