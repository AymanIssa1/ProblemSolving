package ayman.problemsolving.com;

public class ReverseWordsInAStringIII {

    // 557. Reverse Words in a String III
    // https://leetcode.com/problems/reverse-words-in-a-string-iii/

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder(s.length());

        for (String word : words) {
            int length = word.length();
            int counter = length;
            int position = 0;
            char[] wordChars = word.toCharArray();

            while (counter != 0) {
                for (int i = length - 1; i > position; i--) {
                    char temp = wordChars[i];
                    wordChars[i] = wordChars[i - 1];
                    wordChars[i - 1] = temp;
                }

                position++;
                counter--;
            }

            result.append(wordChars).append(" ");
        }

        return result.toString().trim();
    }

}
