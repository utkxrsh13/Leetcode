class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        int uniqueChar = freqMap.size();
        int start = -1;
        int windowStart = 0;
        int windowEnd = 0;
        int minlen = Integer.MAX_VALUE;
        int n = s.length();
        while (windowEnd < n) {
            char ch = s.charAt(windowEnd);
            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.get(ch) - 1);
                if (freqMap.get(ch) == 0) {
                    uniqueChar--;
                }
            }
            while (uniqueChar == 0) {
                int len = windowEnd - windowStart + 1;
                if (len < minlen) {
                    minlen = len;
                    start = windowStart;
                }
                ch = s.charAt(windowStart);
                if (freqMap.containsKey(ch)) {
                    freqMap.put(ch, freqMap.get(ch) + 1);
                    if (freqMap.get(ch) > 0) {
                        uniqueChar++;
                    }
                }
                windowStart++;
            }
            windowEnd++;
        }

        if(start ==-1){
            return "";
        }
        return s.substring(start, start+minlen);
    }
}