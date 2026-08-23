class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int prouct= 1;
        while(temp>0){
            int digit = temp % 10;
            sum += digit; //sum = sum + digit;
            prouct *= digit;  //product = product * digit;
            temp /=10;
        }
        return n % (sum + prouct) == 0;
    }
}