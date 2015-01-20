package junit.org.rapidpm.demo.jdkio2015.v004.gui;

import org.junit.Assert;
import org.junit.Test;
import org.rapidpm.demo.jdkio2015.v003.Controller;

/**
 * Created by sven on 19.01.15.
 */
public class ControllerTest {

    @Test
    public void test001() throws Exception {
        Controller c = new Controller();
        Assert.assertEquals("0", c.add("0", "0"));
    }
    @Test
    public void test002() throws Exception {
        Controller c = new Controller();
        Assert.assertEquals("1", c.add("1", "0"));
    }
    @Test
    public void test003() throws Exception {
        Controller c = new Controller();
        Assert.assertEquals("0", c.add("-1", "1"));
    }
}
