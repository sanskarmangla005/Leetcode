class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n !=0){

            // Last bit check kar rahe hain, agar 1 hai to count badhao
            if ((n & 1) == 1) {
                count ++;
            }

            // // Number ko right shift karke next bit check karenge
            n >>>=1;
        }

         // Total kitne 1 mile wo return karo
        return count;
    }
}

//1011
//last bit → 1 .. count = 1
//101      → last bit 1 .. count = 2
//10       → last bit 0
//1        → last bit 1 .. count = 3