package APTQuiz1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Infrequent {
    public String find(String[] phrases){
        String bigString = "";

        for(String s : phrases)
        {
            bigString += s;
            bigString += " ";
        }

        bigString = bigString.toLowerCase();
        ArrayList<String> words = new ArrayList<>(Arrays.asList(bigString.split(" ")));
        System.out.println("\n\n" + words.toString());


        int min = 1000000;
        String ret = "";
        for(String w : words)
        {
            int currMin = Collections.frequency(words, w);

            if(currMin < min)
            {
                min = currMin;
                ret = w;
            }
        }

        return ret;
    }
}