class Solution {
    public int minimumPushes(String word) {
        


        // We can assign letters optimally.
// First 8 letters need 1 push, next 8 need 2 pushes, and so on.
// Cost of each letter = (i / 8) + 1.


        int n = word.length();
        int res = 0;
        for(int i = 0; i<n; i++){
            res = res +(i/8+1);
        }
        return res;
    }
}