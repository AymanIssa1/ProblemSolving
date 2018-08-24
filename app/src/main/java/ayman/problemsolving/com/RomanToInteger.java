package ayman.problemsolving.com;

public class RomanToInteger {

    // https://leetcode.com/problems/roman-to-integer/description/

    public int romanToInt(String s) {
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char numChar = s.charAt(i);

            if (numChar == 'I' && i < s.length() - 1) {
                if (s.charAt(i + 1) == 'I') {
                    result += 1;
                } else if (s.charAt(i + 1) == 'V') {
                    result += (V - I);
                    i++;
                } else if (s.charAt(i + 1) == 'X') {
                    result += (X - I);
                    i++;
                }

            } else if (numChar == 'X' && i < s.length() - 1) {
                if (s.charAt(i + 1) == 'L') {
                    result += (L - X);
                    i++;
                } else if (s.charAt(i + 1) == 'C') {
                    result += (C - X);
                    i++;
                } else {
                    result += X;
                }
            } else if (numChar == 'C' && i < s.length() - 1) {
                if (s.charAt(i + 1) == 'D') {
                    result += (D - C);
                    i++;
                } else if (s.charAt(i + 1) == 'M') {
                    result += (M - C);
                    i++;
                } else {
                    result += C;
                }
            } else {
                if (numChar == 'M') {
                    result += M;
                } else if (numChar == 'D') {
                    result += D;
                } else if (numChar == 'C') {
                    result += C;
                } else if (numChar == 'L') {
                    result += L;
                } else if (numChar == 'X') {
                    result += X;
                } else if (numChar == 'V') {
                    result += V;
                } else if (numChar == 'I') {
                    result += I;
                }
            }
        }
        return result;
    }

}
