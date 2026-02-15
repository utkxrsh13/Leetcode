import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        // int decimal = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        // String binaryString = Integer.toBinaryString(decimal);
        // return binaryString;

        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        BigInteger sum = num1.add(num2);
        return sum.toString(2);
    }
}