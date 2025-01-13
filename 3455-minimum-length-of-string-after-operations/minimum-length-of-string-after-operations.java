class Solution {
    public int minimumLength(String s) {
        int[] charf = new int[26];
        int tl = 0;
        for (char c : s.toCharArray()) {
            charf[c - 'a']++;
        }
        for (int fr : charf) {
            if (fr == 0) continue;
            if (fr % 2 == 0) {
                tl += 2;
            } else {
                tl += 1;
            }
        }
        return tl;
    }
}