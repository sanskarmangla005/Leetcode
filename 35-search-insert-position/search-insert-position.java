class Solution {
    public int searchInsert(int[] nums, int target) {

        // Array me target ko search krenge
// Target mil gya to uska index return krenge
// Agar current element target se bada hai to wahi target ki position hogi
// Agar kahi nhi mila to last me insert hoga

//          for (int i = 0; i < nums.length; i++) {
//             //Target mil gaya
//             if (nums[i] == target) {
//                 return i;
//             }
            
//             //Target se bada element mil gaya
//             if (nums[i] > target) {
//                 return i;
//             }
//         }

//         return nums.length;
//     }
// }


int low = 0;
int high = nums.length -1;
while(low <= high){
    int mid = (low + high)/2;
    if(nums[mid] == target){
        return mid;
    }
    else if(nums[mid] < target){
        low = mid + 1;
    }
    else {
        high = mid -1;
    }
}
    return low;
}
    }