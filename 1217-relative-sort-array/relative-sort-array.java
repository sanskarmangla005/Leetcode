class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];

        // Count frequencies
        for (int num : arr1) {
            freq[num]++;
        }

        int k = 0;

        // Place elements according to arr2
        for (int num : arr2) {
            while (freq[num] > 0) {
                arr1[k++] = num;
                freq[num]--;
            }
        }

        // Place remaining elements in ascending order
        for (int i = 0; i <= 1000; i++) {
            while (freq[i] > 0) {
                arr1[k++] = i;
                freq[i]--;
            }
        }

        return arr1;
    }
}