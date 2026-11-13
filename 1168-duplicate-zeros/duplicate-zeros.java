class Solution {
    public void duplicateZeros(int[] arr) {
        int[] ans = new int[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (k == arr.length) {
                break;
            }

            if (arr[i] == 0) {
                ans[k++] = 0;

                if (k == arr.length) {
                    break;
                }

                ans[k++] = 0;
            } else {
                ans[k++] = arr[i];
            }
        }

        System.arraycopy(ans, 0, arr, 0, arr.length);
    }
}