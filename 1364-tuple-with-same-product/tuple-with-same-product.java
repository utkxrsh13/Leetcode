class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> pr = new HashMap<>();
        int res =0;
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int product = nums[i]*nums[j];
                res += 8*pr.getOrDefault(product,0);
                pr.put(product,pr.getOrDefault(product,0)+1);
            }
        }
        return res;
    }
}