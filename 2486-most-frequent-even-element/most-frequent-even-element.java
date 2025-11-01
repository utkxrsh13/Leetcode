class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int num: nums){
            if(num%2== 0){
                mp.put(num, mp.getOrDefault(num, 0) + 1);
            }
        }
        int max =0;
        int ans =-1;
        for(Map.Entry<Integer, Integer> entry:mp.entrySet()){
            int num = entry.getKey();
            int count = entry.getValue();
            if(count>max || (count==max && num<ans)){
                max = count;
                ans = num;
            }
        }
        return ans;
    }
}