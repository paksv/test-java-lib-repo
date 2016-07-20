package tcdemo;

import junit.framework.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

/**
 * Created by Sergey.Pak on 7/20/2016.
 */
@Test
public class MyTest {

    public void test1(){

    }

    public void test2(){

    }

    public void test3(){

    }

    public void test4_failed(){
        Assert.fail("Just fail");
    }

    public void test5_skip(){
        throw new SkipException("Just skip");
    }

    public void test6_skip(){
        throw new SkipException("Just skip");
    }
}
