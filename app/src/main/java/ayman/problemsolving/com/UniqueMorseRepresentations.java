package ayman.problemsolving.com;

import java.util.ArrayList;
import java.util.HashMap;

public class UniqueMorseRepresentations {

    // https://leetcode.com/problems/unique-morse-code-words/description/

    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        ArrayList<String> morseWords = new ArrayList<>();

        for(String word : words) {
            String morseWord = "";

            for (char c : word.toCharArray()){
                int morseIndex = c - 97;
                morseWord += morseCodes[morseIndex];
            }

            if(!morseWords.contains(morseWord))
                morseWords.add(morseWord);

            morseWord = "";
        }
        return morseWords.size();
    }

}
