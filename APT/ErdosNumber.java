import java.util.*;

public class ErdosNumber {
    TreeMap<String, Integer> myDistance;
    TreeMap<String, Set<String>> myGraph;

    public String[] calculateNumbers(String[] pubs) {
        makeGraph(pubs);
        ArrayList<String> list = new ArrayList<>();
        bfsErdos();

        for(String s : myGraph.keySet())
        {
            if(myDistance.containsKey(s))
            {
                s = s + " " + myDistance.get(s);
            }
            list.add(s);
        }

        return list.toArray(new String[0]);
    }

    private void bfsErdos()
    {
        myDistance = new TreeMap<>();
        Set<String> visited = new TreeSet<>();
        Queue<String> q = new LinkedList<>();
        String author = "ERDOS";
        q.add(author);
        visited.add(author);
        myDistance.put("ERDOS", 0);
        while(q.size() > 0)
        {
            author = q.remove();
            for(String s: myGraph.get(author)){
                if(!visited.contains(s)){
                    visited.add(s);
                    q.add(s);
                    myDistance.put(s, myDistance.get(author) + 1);
                }
            }
        }

    }

    private void makeGraph(String[] pubs)
    {
        myGraph = new TreeMap<>();
        for(String pub : pubs)
        {
            String fields[] = pub.split(" ");
            for(int i = 0 ; i < fields.length; i++)
            {
                myGraph.putIfAbsent(fields[i], new HashSet<String>());
                for(int k = 0; k < i; k++)
                {
                    myGraph.get(fields[i]).add(fields[k]);
                    myGraph.get(fields[k]).add(fields[i]);
                }
            }
        }
    }
}
