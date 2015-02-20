package za.ac.cput.phoneBook;

import java.util.*;

/**
 * Created by student on 2015/02/16.
 */
public class phoneBook implements phoneBookInterface {
    private List numList;
    private Set nameSet;
    private Map nameMap;

    public String getNumber(){
        numList = new ArrayList();
        numList.add("0711983442");

        String num = (String)numList.get(0);

        return num;
    }

    public int getName(){
        nameSet = new HashSet<String>();
        nameSet.add("Ephraim");
        nameSet.add("Ephraim");
        nameSet.add("Ephraim");
        nameSet.add("Spar");


        int nameCount = nameSet.size();
        return nameCount;
    }

    public String getNameNumber(){
        nameMap = new HashMap();

        nameMap.put("thabo", "0711983442");
        nameMap.put("stunna", "0737118350");

        String name = (String)nameMap.get("thabo");

        return name;
    }


}
