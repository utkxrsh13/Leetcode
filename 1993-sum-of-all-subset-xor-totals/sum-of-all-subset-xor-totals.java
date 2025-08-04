class Solution {
    int res=0;
    public int subsetXORSum(int[] nums) {
        backTrack(nums,0,new ArrayList<>());
        return res;
    }
    private void backTrack(int[] arr, int i, List<Integer> sub){
        int xor =0;
        for(int n:sub) xor ^= n;
        res+=xor;
        for(int j=i;j<arr.length;j++){
            sub.add(arr[j]);
            backTrack(arr,j+1,sub);
            sub.remove(sub.size()-1);
        }
    }
}