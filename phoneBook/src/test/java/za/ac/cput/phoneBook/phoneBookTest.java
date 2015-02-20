package za.ac.cput.phoneBook;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.phoneBook.config.AppConfig;

/**
 * Created by student on 2015/02/16.
 */
public class phoneBookTest {
    private ApplicationContext ctx;
    private phoneBookInterface phoneBook;

    @Before
    public void setUp() throws Exception {

        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        phoneBook = (phoneBookInterface)ctx.getBean("phoneB");

    }

    @After
    public void tearDown() throws Exception {


    }
    @Test
    public void addNumberTest() throws Exception {

        Assert.assertEquals("0711983442", phoneBook.getNumber());
    }

    @Test
    public void addNameTest() throws Exception {

        Assert.assertEquals(2, phoneBook.getName());
    }

    @Test
    public void addNameNumberTest() throws Exception {

        Assert.assertEquals("0711983442", phoneBook.getNameNumber());
    }
}
