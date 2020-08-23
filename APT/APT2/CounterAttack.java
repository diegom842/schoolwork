package APT2;

import java.util.ArrayList;
import java.util.Arrays;

public class CounterAttack {
    public int[] analyze(String str, String[] words) {

        int[] occurrences = new int[words.length];

        for(int i = 0; i < words.length; i ++)
        {
            occurrences[i] = getOccurence(str, words[i]);
        }


        return occurrences;
    }

    public int getOccurence(String str, String target)
    {

        String[] splitList = str.split(" ");

        ArrayList<String> strList = new ArrayList<>(Arrays.asList(splitList));




        int occurrences = 0;
        for(int i = 0; i <strList.size(); i++)
        {
            System.out.print("Word we're looking for: " + target +" | Word in list: " + strList.get(i));


            if(strList.get(i).equals(target)) {
                System.out.println(" | Equal? True.");
                occurrences++;
            }

            System.out.println("Occurrence: " + occurrences);
        }

        return occurrences;
    }
}