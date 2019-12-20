package ayman.problemsolving.com;

public class RotatedDigits {

    // 788. Rotated Digits
    // https://leetcode.com/problems/rotated-digits/submissions/

    public int rotatedDigits(int N) {
        int result = 0;

        for (int i = 1; i <= N; i++) {
            int num = i;
            boolean contain357 = false;
            boolean contain2569 = false;

            while (num != 0) {
                int mod = num % 10;
                if (mod == 2 || mod == 5 || mod == 6 || mod == 9)
                    contain2569 = true;

                if (mod == 3 || mod == 4 || mod == 7)
                    contain357 = true;

                num /= 10;
            }

            if (!contain357 && contain2569)
                result++;
        }

        return result;
    }

}
