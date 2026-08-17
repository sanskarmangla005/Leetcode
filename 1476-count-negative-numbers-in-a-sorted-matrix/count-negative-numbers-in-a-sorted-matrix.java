class Solution {
    public int countNegatives(int[][] grid) {
        // int count = 0;
        // for(int )
        int ans = 0;

        //har row ko chechk krenge
        for(int[] row : grid){
            // Row k hr no ko check kr rhe hai
            for(int num: row){

                // agar no -ve hai to count bdha dengee
                if(num < 0){
                    ans++;
                }
            }
        }
        return ans;
    }
}