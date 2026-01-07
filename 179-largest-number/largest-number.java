class Solution {
    public String largestNumber(int[] nums) {
        String[] s = new String[nums.length];
        for(int i =0;i<nums.length;i++){
            s[i] = String.valueOf(nums[i]);

        }
        Arrays.sort(s, (a,b)->{
            String s1 = a + b;
            String s2 = b + a;
            return s2.compareTo(s1);
        });

        if(s[0].equals("0")) return "0";

        StringBuilder res = new StringBuilder();
        for(String i:s){
            res.append(i);
        }
        return res.toString();
    }
}