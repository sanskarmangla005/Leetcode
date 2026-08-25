class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> s = new HashSet<>();
        for(int n : nums){
            s.add(n);
        }
        int x = k;
        while (s.contains(x)) {
            x = x + k;
        }
        return x;
    }
}