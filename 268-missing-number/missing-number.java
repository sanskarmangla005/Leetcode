//LOGIC
//[2,3,5,0,1], output(4)
//logic 1- sum=n(n+1)/2 = tota sum-actual sum = 15-11 = 4 (5(5+1)/2)=4
//logic 2- (XOR[0,n] ^ XOR array)  = [A^0 = A]
                                    // [A ^A = 0]
// (0^1^2^3^4^5) ^ (2^3^5^0^1)= by the use of property all cancel with each other
// 4^0=4 _____[A^0 = A]----By this property-------(1)

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor1 = 0;
        int xor2= 0;
        for(int i = 0;i<n;i++){
            xor1^=nums[i];
            xor2^=i;
        }
        xor2^=n;
        return xor1^xor2;
    }
};