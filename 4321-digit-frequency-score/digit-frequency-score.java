class Solution {
    public int digitFrequencyScore(int n) {
        int summ = 0;
        while(n>0){
            summ+=n%10;
            n/=10;
        }
        return summ;
    }
}