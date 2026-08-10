class Solution {
    public int[] getConcatenation(int[] nums) {
        

// nums ko 2 baar concatenate karna hai
// pehle half me original nums copy karo
// doosre half me bhi wahi nums copy karo
// isliye ans ki length 2 * n hogi
int n = nums.length;
int[] ans = new int[2 * n];
for(int i = 0; i<n; i++){
ans[i] = nums[i];
ans[i + n] = nums[i];
    }
    return ans;
}
}