package ayman.problemsolving.com;

public class RearrangingAWord {

    public static void main(String... args) {
        System.out.println(rearrangeWord("xy"));
        System.out.println(rearrangeWord("pp"));
        System.out.println(rearrangeWord("hefg"));
        System.out.println(rearrangeWord("baaa"));
        System.out.println(rearrangeWord("baca"));
    }

    public static String rearrangeWord(String word) {
        char[] wordChars = word.toCharArray();
        for (int i = wordChars.length -1; i > 0 ; i--){
            if (wordChars[i] > wordChars[i-1]) {
                char temp = wordChars[i];
                wordChars[i] = wordChars[i-1];
                wordChars[i-1] = temp;
                return new String(wordChars);
            }
        }
        return "no answer";
    }

}
