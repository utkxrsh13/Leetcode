class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int i = players.length-1;
        int j = trainers.length-1;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int count=0;

        while(i>=0 && j>=0){
            if(players[i]<=trainers[j]){
                count++;
                j--;
            }
            i--;
        }
        return count;
    }
}