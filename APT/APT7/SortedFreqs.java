package APT7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class SortedFreqs {
    public int[] freqs(String[] data) {

        ArrayList<String> strings = new ArrayList<>(Arrays.asList(data));
        TreeSet<String> strSet = new TreeSet<>(strings);
        int[] freqs = new int[strSet.size()];

        int i = 0;
        for(String s : strSet)
        {
            freqs[i] += Collections.frequency(strings, s);
            i++;
        }

        return freqs;
    }
}