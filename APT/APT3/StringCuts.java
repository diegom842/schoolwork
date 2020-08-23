package APT3;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        LinkedHashSet<String> wordSet = new LinkedHashSet<>(Arrays.asList(list));

        LinkedHashSet<String> small = new LinkedHashSet<>();
        for(int i = 0; i < wordSet.size(); i++)
        {
            if(wordSet.toArray()[i].toString().length() < minLength)
                small.add(wordSet.toArray()[i].toString());
        }
        wordSet.removeAll(small);

        return wordSet.toArray(new String[wordSet.size()]);
    }
}
