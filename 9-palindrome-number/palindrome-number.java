class Solution {
    public boolean isPalindrome(int x) {
             if (x < 0) return false;
        int original = x;
       int reversed = 0;
       while(x!=0){
        int digit = x%10;
        reversed = reversed*10+digit;
       x/=10;
       }
       return original == reversed;
       }
       }
//         if(x==121){
//             return true;
//         }
//         else if(x==-121){
//             return false;
//         }
//         else if(x==10){
//             return false;
//         }
//         return true;
//     }
// }
