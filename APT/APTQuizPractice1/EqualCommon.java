package APTQuizPractice1;

import java.util.*;

public class EqualCommon {
    public String[] matches(String[] a1, String[] a2) {
        //removes duplicates
        LinkedHashSet<String> first = new LinkedHashSet<>(Arrays.asList(a1.toString()));
        LinkedHashSet<String> second = new LinkedHashSet<>(Arrays.asList(a2.toString()));

        //stores counts
        ArrayList<Integer> count1 = new ArrayList<>(Collections.nCopies(50, 0));
        ArrayList<Integer> count2 = new ArrayList<>(Collections.nCopies(50, 0));

        for(String s : first)
        {
            count1.add(Collections.frequency(Arrays.asList(a1), s));
        }

        for(String s : second)
        {
            count2.add(Collections.frequency(Arrays.asList(a2), s));
        }

        String[] A1 = first.toArray(new String[first.size()]);
        String[] A2 = first.toArray(new String[second.size()]);

        ArrayList<String> one = new ArrayList<>(Arrays.asList(A1));
        ArrayList<String> two = new ArrayList<>(Arrays.asList(A2));




        ArrayList<String> matched = new ArrayList<>();
        for(int i = 0; i < Math.max(first.size(), second.size()); i++)
        {
            if(count1.get(i) == count2.get(i))
            {
                matched.add(one.get(i));
            }
        }



        return new String[0];
    }
}