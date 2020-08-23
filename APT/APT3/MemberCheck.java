package APT3;

import java.util.Arrays;
import java.util.TreeSet;

public class MemberCheck {
    public String[] whosDishonest(String[] club1,
                                  String[] club2,
                                  String[] club3) {
        TreeSet<String> clubA = new TreeSet<>(Arrays.asList(club1));
        TreeSet<String> clubB = new TreeSet<>(Arrays.asList(club2));
        TreeSet<String> clubC = new TreeSet<>(Arrays.asList(club3));

        TreeSet<String> filter1 = retainDuplicates(clubA, clubB);
        TreeSet<String> filter2 = retainDuplicates(clubA, clubC);
        TreeSet<String> filter3 = retainDuplicates(clubB, clubC);

        TreeSet<String> ret = new TreeSet<>();
        ret.addAll(filter1);
        ret.addAll(filter2);
        ret.addAll(filter3);

        return ret.toArray(new String[ret.size()]);
    }

    public TreeSet<String> retainDuplicates(TreeSet<String> a, TreeSet<String> b)
    {
        TreeSet<String> ret = new TreeSet<>();

        for(int i = 0; i < a.size(); i++) {
            for(int k = 0; k < b.size(); k++) {
                if(a.toArray()[i].equals(b.toArray()[k])) {
                    ret.add(a.toArray()[i].toString());
                    break;
                }
            }
        }

        return ret;
    }
}
