class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        dfs(nums,0,sub,res);
        return res;
    }
    private void dfs(int[] arr,int i, List<Integer> sub, List<List<Integer>> res){
        if(i>=arr.length){
        res.add(new ArrayList<>(sub));
        return;
    }
    sub.add(arr[i]);
    dfs(arr,i+1,sub,res);
    sub.remove(sub.size()-1);
    dfs(arr,i+1,sub,res);
    }
    
}