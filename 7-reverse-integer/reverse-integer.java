
class Solution {
    public int reverse(int x) {

        int rev = 0;

        while(x != 0) {

            // last digit nikal rhe hai
            int digit = x % 10;

            // overflow check
            if(rev > Integer.MAX_VALUE / 10 ||
               rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            // reverse number bana rhe hai
            rev = rev * 10 + digit;

            // last digit hata rhe hai
            x = x / 10;
        }

        return rev;
    }
}
