package za.ac.cput.phoneBook;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.phoneBook.addNameImplementation.addNameImp;


/**
 * Created by student on 2015/02/20.
 */
public class addNameTest {
    private addNameInterface myAddInt;
    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void addName() throws Exception{
        myAddInt =  new addNameImp();
        Assert.assertEquals("stunna",myAddInt.getName());
    }


}
