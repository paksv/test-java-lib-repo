package tcdemo;

import junit.framework.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

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
        AtomicInteger ii = new AtomicInteger();
        for (int i=0; i<10; i++){
            called(ii);
        }
        System.out.println(ii);
        for (int i=0; i<10; i++){
            called(ii);
        }
    }

    private void called(AtomicInteger ii){
        ii.incrementAndGet();
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
