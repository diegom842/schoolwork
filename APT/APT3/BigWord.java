//package APT3;

import java.util.*;

public class BigWord {
    public String most(String[] sentences) {

        String total = "";
        for(String s : sentences)
        {
            total = total + s + " ";
        }
        total = total.toLowerCase();

        ArrayList<String> strings = new ArrayList<>(Arrays.asList(total.split(" ")));
        TreeSet<String> set = new TreeSet<>(strings);

        ArrayList<Integer> count = new ArrayList<>();
        for (int i = 0; i < set.size(); i++) {
            count.add(0);
        }

        for(int i = 0; i < set.size(); i++)
        {
            for(int k = 0; k < strings.size(); k++)
            {
                if(set.toArray()[i].equals(strings.get(k)))
                {
                    count.set(i, count.get(i) + 1);
                }
            }
        }
        int idx = count.indexOf(Collections.max(count));

        return set.toArray()[idx].toString();
    }
}
