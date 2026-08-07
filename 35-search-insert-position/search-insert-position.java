class Solution {
    public int searchInsert(int[] nums, int target) {

        // Array me target ko search krenge
// Target mil gya to uska index return krenge
// Agar current element target se bada hai to wahi target ki position hogi
// Agar kahi nhi mila to last me insert hoga

         for (int i = 0; i < nums.length; i++) {
            //Target mil gaya
            if (nums[i] == target) {
                return i;
            }
            
            //Target se bada element mil gaya
            if (nums[i] > target) {
                return i;
            }
        }

        return nums.length;
    }
}
