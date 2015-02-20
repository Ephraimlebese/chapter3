package za.ac.cput.phoneBook.addNameImplementation;


import za.ac.cput.phoneBook.addNameInterface;

import java.util.*;

/**
 * Created by student on 2015/02/20.
 */
public class addNameImp implements addNameInterface {
    private List numList;


    @Override
    public String getName(){

        numList = new ArrayList();
        numList.add("stunna");

        String num = (String)numList.get(0);

        return num;
    }
}
