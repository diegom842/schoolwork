package APT2;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleWordGame
{
    public int points(String[] player, String[] dictionary) {

        ArrayList<String> playerWords = new ArrayList<>(Arrays.asList(player));

        System.out.println(playerWords.toString());
        //Deletes duplicate words
        for(int i = 0; i < playerWords.size(); i++)
        {
            int repeats = 0;

            for(int k = 0; k < playerWords.size(); k++)
            {
                if(playerWords.get(i).equals(playerWords.get(k)))
                    repeats ++;
                if(repeats >= 2)
                    playerWords.remove(k);
            }
        }

        System.out.println(playerWords.toString());

        int charScore = 0;
        for (String word : playerWords)
        {
            System.out.println("Word: " + word);
            for (int i = 0; i < dictionary.length; i++)
            {
                if (dictionary[i].equals(word)) {
                    System.out.println("Dictionary word: " + dictionary[i] + " User Word: " + word);
                    charScore += (word.length() * word.length());
                    System.out.println(charScore);
                }
            }
        }

        return charScore;
    }
}
