
class Solution {
    public String digitSum(String s, int k) {

        while(s.length() > k) {

            String ans = "";

            // k size ke group bana rhe hai
            for(int i = 0; i < s.length(); i += k) {

                int sum = 0;

                // group ke digits ka sum
                for(int j = i; j < i + k && j < s.length(); j++) {
                    sum += s.charAt(j) - '0';
                }

                // sum ko string me add kr diya
                ans += sum;
            }

            // string update kr di
            s = ans;
        }

        return s;
    }
}
