class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] nums) {

        // pehle array ko sort kr diya
        Arrays.sort(nums);
        nums[0] = 1;
        // ab har element ko check krenge
        for(int i = 1;i<nums.length;i++){
            // agar current element previous element se 1 se jyada bada hai
            if(nums[i]>nums[i-1]+1){
                 // to current element ko previous + 1 kr denge
                nums[i] = nums[i-1]+1;
            }
        }
        // last me jo value bchegi wahi maximum answer hoga
        return nums[nums.length-1];
    }
}