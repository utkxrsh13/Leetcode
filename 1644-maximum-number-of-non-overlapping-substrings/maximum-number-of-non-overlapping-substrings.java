class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int n = s.length();
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);

        for(int i = 0; i < n; i++){
            int c = s.charAt(i) - 'a';
            if (first[c] == -1) first[c] = i;
            last[c] = i;
        }

        List<int[]> candidates = new ArrayList<>();

        for(int c = 0; c < 26; c++){
            if (first[c] == -1) continue; // char not present

            int start = first[c];
            int end = last[c];
            boolean valid = true;

            int j = start;
            while(j <= end){
                int cj = s.charAt(j) - 'a';
                if(first[cj] < start){
                    valid = false;
                    break;
                }
                end = Math.max(end, last[cj]);
                j++;
            }

            if(valid){
                candidates.add(new int[]{start, end});
            }
        }

        // Sort by end index
        candidates.sort((a, b) -> a[1] - b[1]);

        List<String> result = new ArrayList<>();
        int lastEnd = -1;
        for (int[] interval : candidates) {
            if (interval[0] > lastEnd) {
                result.add(s.substring(interval[0], interval[1] + 1));
                lastEnd = interval[1];
            }
        }

        return result;
    }
}