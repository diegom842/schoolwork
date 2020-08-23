package APTQuiz1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class WordScore {
    public int[] score(String[] words, String want, String avoid) {
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(words));
        ArrayList<Integer> countList = new ArrayList<>();

        for(String w : wordList)
            countList.add(0);

        TreeSet<Character> wantSet= new TreeSet<>();
        for(char c : want.toCharArray())
        {
            wantSet.add(c);
        }

        TreeSet<Character> avoidSet= new TreeSet<>();
        for(char c : avoid.toCharArray())
        {
            avoidSet.add(c);
        }

        for(int i = 0; i < wordList.size(); i++)
        {
            char[] charArray = wordList.get(i).toCharArray();

            for(Character c : wantSet)
            {
                countList.set(i, countList.get(i) + getRepeat(charArray, c));
            }

            for(Character c : avoidSet)
            {
                countList.set(i, countList.get(i) - getRepeat(charArray, c));
            }

        }

        int[] count = new int[countList.size()];

        for(int i = 0; i < countList.size(); i++)
        {
            count[i] = countList.get(i);
        }

        return count;
    }

    public int getRepeat(char[] charList, char c)
    {
        int count  = 0;
        for(Character cc : charList)
        {
            if(cc.equals(c))
                count++;
        }

        return count;
    }

}