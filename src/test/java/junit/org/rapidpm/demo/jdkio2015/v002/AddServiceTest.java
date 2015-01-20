package junit.org.rapidpm.demo.jdkio2015.v002;

import org.junit.Assert;
import org.junit.Test;
import org.rapidpm.demo.jdkio2015.v002.AddService;

/**
 * Created by sven on 19.01.15.
 */
public class AddServiceTest {
    @Test
    public void testAdd001() throws Exception {
        AddService service = new AddService();
        int r = service.add(0, 0);
        Assert.assertEquals(0, r);
    }
    @Test
    public void testAdd002() throws Exception {
        AddService service = new AddService();
        int r = service.add(0, 1);
        Assert.assertEquals(1, r);
    }
    @Test
    public void testAdd003() throws Exception {
        AddService service = new AddService();
        int r = service.add(-1, 1);
        Assert.assertEquals(0, r);
    }
}
