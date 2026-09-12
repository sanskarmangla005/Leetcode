class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        Arrays.sort(nums);

        int odd = 1;

        for (int i = 0; i < nums.length; i += 2) {

            if (nums[i] % 2 != 0) {

                while (nums[odd] % 2 != 0) {
                    odd += 2;
                }

                int temp = nums[i];
                nums[i] = nums[odd];
                nums[odd] = temp;
            }
        }

        return nums;
    }
}