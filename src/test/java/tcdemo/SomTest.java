package tcdemo;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by sergey on 4/29/2016.
 */
@Test
public class SomTest {

    private SomeInner someInner = new SomeInner();

    @BeforeMethod
    public void setUp(){

    }

    public void test1(){
        Assert.fail("Hello");
    }

    public void test2(){
        System.out.println("test2");
    }

    public void test3(){
        System.out.println("test3");
    }


    private static class SomeInner{

        private SomeInner(){
            System.out.println("Initialized SomeInner");
        }

    }
}
