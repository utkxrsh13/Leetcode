class Solution {
    public int romanToInt(String s) {
        int res = 0;
        Map<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I',1);
        romanToInt.put('V',5);
        romanToInt.put('X',10);
        romanToInt.put('L',50);
        romanToInt.put('C',100);
        romanToInt.put('D',500);
        romanToInt.put('M',1000);
        for(int i =0;i<s.length()-1;i++){
            if(romanToInt.get(s.charAt(i))< romanToInt.get(s.charAt(i+1))){
                res -= romanToInt.get(s.charAt(i));
            }else{
                res+= romanToInt.get(s.charAt(i));
            }
        }
        return res+ romanToInt.get(s.charAt(s.length()-1));
    }
}