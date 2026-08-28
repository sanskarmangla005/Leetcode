class Solution {
    public int trap(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        int ans = 0;

        while (left < right) {

            // check krnege yha pr ki  which side has smaller height
            if (height[left] <= height[right]) {

                //  maximum height from left side
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                }
                // water cal from left side
                else {
                    ans = ans + leftMax - height[left];
                }

                left++;

            } else {

                //  maximum height from right side
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                }
                // water  cal from right side
                else {
                    ans = ans + rightMax - height[right];
                }

                right--;
            }
        }

        return ans;
    }
}