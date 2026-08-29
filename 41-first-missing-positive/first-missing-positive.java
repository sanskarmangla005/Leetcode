class Solution {
    public int firstMissingPositive(int[] nums) {

        Arrays.sort(nums); // sort kr diya

        int count = 1; // 1 se check krenge

        for(int i = 0; i < nums.length; i++){

            if(count == nums[i])
                count++; // number mil gya, next check

            else if(nums[i] > count)
                return count; // count missing hai
        }

        return count; // sab mil gye, next count answer
    }
}