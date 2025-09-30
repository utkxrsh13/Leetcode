class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int curr = q.poll();
            if(arr[curr]==0) return true;
            if(arr[curr]<0) continue;

            if(arr[curr]+curr<n){
                q.add(curr+arr[curr]);
            }
            if(curr-arr[curr] >= 0){
                q.add(curr-arr[curr]);
            }

            arr[curr] = -arr[curr];
        }
        return false;
    }
}