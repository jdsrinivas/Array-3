class HIndexSolution {
    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0) {
            return 0;
        }

        int n = citations.length;
        Arrays.sort(citations);
        for (int i = 0; i < n; i++) {
            int j = n - i;
            if (citations[i] >= j) {
                return j;
            }
        }
        return -1;
    }
}