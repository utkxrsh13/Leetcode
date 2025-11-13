class Solution {
    public String convertDateToBinary(String date) {
        String[] sp = date.split("-");

        int yr = Integer.parseInt(sp[0]);
        int mon = Integer.parseInt(sp[1]);
        int day = Integer.parseInt(sp[2]);

        String binyr = Integer.toBinaryString(yr);
        String binmon = Integer.toBinaryString(mon);
        String binday= Integer.toBinaryString(day);

        return binyr+"-"+binmon+"-"+binday;
    }
}