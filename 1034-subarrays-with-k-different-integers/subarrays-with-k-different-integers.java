class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
    private int atMost(int[] arr, int k){
        Map<Integer,Integer> mp = new HashMap<>();
        int res =0;
        int left =0;
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
            while(mp.size()>k){
                mp.put(arr[left], mp.get(arr[left])-1);
                if(mp.get(arr[left])==0){
                    mp.remove(arr[left]);
                }
                left++;
            }
            res+= (i-left)+1;
        }
        return res;
    }
}