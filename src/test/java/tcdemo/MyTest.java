package tcdemo;

import junit.framework.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Sergey.Pak on 7/20/2016.
 */
@Test
public class MyTest {

    public void test1(){

    }

    public void test2() throws IOException {
        System.getProperties().store(System.out, "");
    }

    public void test3(){

    }

    public void test_conditionally(){
        final String osName = System.getProperty("param.os.name");
        Assert.assertEquals("Linux", osName);
    }

    public void test5_skip(){
        throw new SkipException("Just skip");
    }

    public void test6_skip(){
        throw new SkipException("Just skip");
    }
}
