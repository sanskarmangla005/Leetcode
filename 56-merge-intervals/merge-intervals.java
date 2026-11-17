
class Solution {
    public int[][] merge(int[][] intervals) {
        // intervals ko starting point ke according sort kiya
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> list = new ArrayList<>();
        // first interval ko current maan liya
        int[] current = intervals[0];
        list.add(current);
        for(int[] next : intervals) {
            // agar intervals overlap kar rhe hai
            if(current[1] >= next[0]) {
                // ending point ko update kar diya
                current[1] = Math.max(current[1], next[1]);
            }
            else {
                // overlap nhi hai toh new interval add kiya
                current = next;
                list.add(current);
            }
        }
        // list ko 2D array me convert kiya
        return list.toArray(new int[list.size()][]);
    }
}
