import java.util.*;

public class FriendScore {
    Map<Integer, Set<Integer>> myGraph;
    public int highestScore(String[] friends) {
        myGraph = createMap(friends);
        int maxTwoFriends = 0;
        for(int i = 0; i < friends.length; i++){
            int temp = twoFriends(i).size();
            if(temp > maxTwoFriends)
                maxTwoFriends = temp;
        }

        return maxTwoFriends;
    }

    private Map<Integer, Set<Integer>> createMap(String[] friends) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for(int i = 0; i < friends.length; i++){
            graph.putIfAbsent(i, new HashSet<Integer>());
            for(int j = 0; j < friends[i].length(); j++){
                if(friends[i].charAt(j) == 'Y') {
                    graph.get(i).add(j);
                }
            }
        }
        return graph;
    }

    private Set<Integer> twoFriends(int index){
        Set<Integer> set = new TreeSet<>();
        Set<Integer> friends = myGraph.get(index);
        set.addAll(friends);
        for(int friend: friends){
            set.addAll(myGraph.get(friend));
        }
        set.remove(index);
        return set;
    }
}
