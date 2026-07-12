class Solution {
    private int toSecond(String time) {
        int second = Integer.parseInt(time.substring(0, 2)) * 3600 +
                     Integer.parseInt(time.substring(3, 5)) * 60 +
                     Integer.parseInt(time.substring(6, 8));

        return second;
    }
    public int secondsBetweenTimes(String startTime, String endTime) {
        return toSecond(endTime) - toSecond(startTime);
    }
}