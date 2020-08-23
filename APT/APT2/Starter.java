//package APT2;

import java.util.ArrayList;
import java.util.Arrays;

public class Starter {
    public int begins(String[] words, String first) {


        ArrayList<String> wordsList = removeDupes(words);

        int uniqueCount = 0;
        for (int i = 0; i < wordsList.size(); i++) {
            if (wordsList.get(i).charAt(0) == first.toCharArray()[0])
                uniqueCount++;
        }

        return uniqueCount;
    }

    public ArrayList<String> removeDupes(String[] list) {
        ArrayList<String> ret = new ArrayList<>();
        for(String s : list) {
            boolean done = false;
            for(int k=0; k < ret.size(); k += 1) {
                String current = ret.get(k);
                if (current.equals(s)) {
                    done = true;
                    break;  // break out of loop looking at ret
                }
                if (current.compareTo(s) > 0) {
                    ret.add(k,s);
                    done = true;
                    break;
                }
            }
            if (! done) {
                ret.add(s);   // add at end, greater than all so far
            }
        }
        return ret;

    }
}


