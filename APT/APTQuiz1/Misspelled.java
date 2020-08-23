package APTQuiz1;

import java.util.ArrayList;
import java.util.Arrays;

public class Misspelled {
    public int howMany(String[] words, String[] dictionary) {
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(words));
        ArrayList<String> dicList = new ArrayList<>(Arrays.asList(dictionary));

        int misspelled = 0;
        for(String word : wordList)
        {
            if(!dicList.contains(word))
            {
                misspelled += 1;
            }
        }

        return misspelled;
    }
}