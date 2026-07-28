// class Solution {
//     public int maximumProduct(int[] nums) {
        // int max1 = Integer.MIN_VALUE; //largest 2 no ko stre krne ke liye
        // int max2 = Integer.MIN_VALUE; //largest 2 no ko stre krne ke liye
        // int max3 = Integer.MIN_VALUE; //largest 2 no ko stre krne ke liye

        // int min1 = Integer.MAX_VALUE; //Smallest 2 numbers ko store karne ke liye
        // int min2 = Integer.MAX_VALUE; //Smallest 2 numbers ko store karne ke liye

        // for(int num:nums){
        //     if(nums>max1){
        //         max3=max2;
        //         max2=max1;
        //         max1=num;
        //     }
        //     else if(num>max2){
        //         max2=max2;
        //         max2=num;
        //     }

        // }
import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        return Math.max(
            nums[n - 1] * nums[n - 2] * nums[n - 3],
            nums[n - 1] * nums[0] * nums[1]
        );
    }
}

 