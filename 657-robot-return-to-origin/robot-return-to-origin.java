class Solution {
    public boolean judgeCircle(String moves) {
        int countX = 0;
        int countY = 0;
        for(char c: moves.toCharArray()){
            if(c == 'U') countY++;
            else if(c == 'D') countY--;
            else if(c == 'L') countX++;
            else if(c == 'R') countX--;
        }
        return countX == 0 && countY == 0;
    }
}