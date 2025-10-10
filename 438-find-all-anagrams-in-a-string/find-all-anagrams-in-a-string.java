class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        if (s.length() < p.length()) return res;

        int[] pCount = new int[26];
        int[] sCount = new int[26];
        int pLen = p.length();
        int sLen = s.length();

        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }
        for (int i = 0; i < sLen; i++) {
            // Add current character to window
            sCount[s.charAt(i) - 'a']++;

            // Remove character that is no longer in window
            if (i >= pLen) {
                sCount[s.charAt(i - pLen) - 'a']--;
            }

            // Step 3: Compare current window with p’s frequency
            if (Arrays.equals(pCount, sCount)) {
                res.add(i - pLen + 1);
            }
        }
        return res;
    }
}