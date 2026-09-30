class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] answer = new int[seq.length()];
        int currentGroup = 1;

        for(int i = 0;i < seq.length();i++){
            char bracket = seq.charAt(i);

            if(bracket == '('){
                answer[i] = 1 - currentGroup;
            }else{
                answer[i] = currentGroup;
            }
            currentGroup ^= 1;
        }

        return answer;
    }
}