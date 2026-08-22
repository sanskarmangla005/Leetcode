class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
       for(int i = 0; i<arr.length-2;i++){
        if(arr[i] % 2!=0 &&  //1 % 2 != 0 → true
        arr[i+1] %2 !=0 &&   //3 % 2 != 0 → true
        arr[i+2] % 2 != 0){  //5 % 2 != 0 → true
            return true;
        }
       }
       return false;
    }
}