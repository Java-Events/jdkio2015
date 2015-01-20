package junit.org.rapidpm.demo.jdkio2015.v003.services;

import org.junit.Assert;
import org.junit.Test;
import org.rapidpm.demo.jdkio2015.v003.services.String2Int;

/**
 * Created by sven on 19.01.15.
 */
public class String2IntTest {

    @Test
    public void test001() throws Exception {
        String2Int s = new String2Int();
        int r = s.convert("0");
        Assert.assertEquals(r, 0);
    }
    @Test
    public void test002() throws Exception {
        String2Int s = new String2Int();
        int r = s.convert("1");
        Assert.assertEquals(r, 1);
    }
}
