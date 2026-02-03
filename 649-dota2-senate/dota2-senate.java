class Solution {
    public String predictPartyVictory(String senate) {
         Queue<Integer> qr = new LinkedList<>();
        Queue<Integer> qd = new LinkedList<>();
        int n = senate.length();
        for(int i = 0;i < n;i++){
            if(senate.charAt(i) == 'R') qr.add(i);
            else qd.add(i);
        }
        for(;!qr.isEmpty() && !qd.isEmpty();){
            int ri = qr.poll();
            int di = qd.poll();
            if(ri < di) qr.add(ri + n);
            else qd.add(di + n);
        }
        return qr.size() > qd.size() ? "Radiant" : "Dire";
    }
}