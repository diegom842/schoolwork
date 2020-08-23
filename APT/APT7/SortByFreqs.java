//package APT7;


import java.util.*;

public class SortByFreqs {
    public String[] sort(String[] data) {

        HashMap<String, Integer> dataSet = new HashMap<>();
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(data));
        TreeSet<String> strSet = new TreeSet<>(strings);

        for(String s : strSet)
        {
            dataSet.putIfAbsent(s, Collections.frequency(strings, s));
        }

        String[] sortedFreqs =  new String[strSet.size()];
        int i = 0;
        for (Map.Entry<String, Integer> en : dataSet.entrySet()){
            sortedFreqs[i] = en.getKey();
        }

        return sortedFreqs;
    }

    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> map)
    {
        List<Map.Entry<String, Integer>> list = new
                LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();

        for(Map.Entry<String, Integer> aa:list){
            temp.put(aa.getKey(), aa.getValue());
        }

        return temp;
    }
}