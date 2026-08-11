class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];

        //Sequential elemnts ka sum nikallengee
        for (int i = 1; i < nums.length && nums[i] == nums[i -1] + 1; i++){
            sum += nums[i];
        }

        // aarray ka elements set me strorekrao
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        //sum agar phle se present hai to next number check krte hai
        while (set.contains(sum)) {
            sum++;
        }
        return sum;
    }
}