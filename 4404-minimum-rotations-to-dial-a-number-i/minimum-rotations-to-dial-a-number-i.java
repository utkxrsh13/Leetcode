class Solution {
    public int minRotations(String s) {
        return IntStream.range(0, s.length())
            .map(i -> (s.charAt(i) - (i > 0 ? s.charAt(i - 1) : '0') + 10) % 10)
            .map(d -> Math.min(d, 10 - d)) 
            .sum();
    }
}