package APTQuiz1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Conflicts {
    public String[] conflict(String[] info){

        ArrayList<String> classes = new ArrayList<>();
        ArrayList<String> times = new ArrayList<>();

        for(String s : info) //want idx = 1 to get assigned to classes
        {
            String[] tempArr = new String[3];
            tempArr = s.split(":");

            classes.add(tempArr[1]);
            times.add(tempArr[2]);
        }

        TreeSet<String> duplicates = new TreeSet<>();

        for(int i = 0; i < classes.size(); i++)
        {
            if( i == classes.size() - 1) //if it's the last one (to prevent out of bounds)
            {
                break;
            }

            if(classes.get(i).equals(classes.get(i + 1))) //if current class == next class
            {
                String[] arr1 = times.get(i).split(",");
                ArrayList<String> timeArr1 = new ArrayList<>(Arrays.asList(arr1));

                String[] arr2 = times.get(i + 1).split(",");
                ArrayList<String> timeArr2 = new ArrayList<>(Arrays.asList(arr2));

                for(String t : timeArr1)
                {
                    if(timeArr2.contains(t))
                    {
                        duplicates.add(classes.get(i));
                    }
                }
            }

        }

        String[] conflicts = new String[duplicates.size()];
        int idx = 0;
        for(String s : duplicates)
        {
            conflicts[idx] = s;
            idx++;
        }

        return conflicts;
    }
}