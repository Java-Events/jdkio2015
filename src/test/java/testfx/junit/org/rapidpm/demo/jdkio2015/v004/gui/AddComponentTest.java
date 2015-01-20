package testfx.junit.org.rapidpm.demo.jdkio2015.v004.gui;

import javafx.application.Platform;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.junit.Assert;
import org.junit.Test;
import org.loadui.testfx.Assertions;
import org.loadui.testfx.GuiTest;
import org.rapidpm.demo.jdkio2015.v004.gui.AddComponent;

import java.lang.management.PlatformLoggingMXBean;

import static org.loadui.testfx.controls.Commons.hasText;

/**
 * Created by sven on 19.01.15.
 */
public class AddComponentTest extends GuiTest {

    @Override
    protected Parent getRootNode() {
        AddComponent addComponent = new AddComponent();
        addComponent.setId("c");
        return addComponent;
    }

    @Test
    public void test001() throws Exception {
        Node c = find("#c");
        Assert.assertNotNull(c);
        TextField tf1 = find("#tf1", c);
        TextField tf2 = find("#tf2", c);
        clickOn(tf1).write("1");
        clickOn(tf2).write("2");
        clickOn((Button)find("#btnAdd")).clickOn();
        TextField tfResult = find("#tfResult");
        Assertions.verifyThat(tfResult, hasText("3"));
        Thread.sleep(5_000);
    }
    @Test
    public void test002() throws Exception {
        Node c = find("#c");
        Assert.assertNotNull(c);
        TextField tf1 = find("#tf1", c);
        TextField tf2 = find("#tf2", c);
        clickOn(tf1).write("1");
        clickOn(tf2).write("3");
        clickOn((Button)find("#btnAdd")).clickOn();
        TextField tfResult = find("#tfResult");
        Assertions.verifyThat(tfResult, hasText("4"));
        Thread.sleep(5_000);
    }

    @Test
    public void test003() throws Exception {
        doTestInitTestStuff("0", "0", "0");
        doTestInitTestStuff("0", "1", "1");
        doTestInitTestStuff("2", "1", "3");
        //show the screenshot
//        doTestInitTestStuff("2", "1", "30000");


    }

    public void doTestInitTestStuff(String v1, String v2, String result){
        Node c = find("#c");
        Assert.assertNotNull(c);
        TextField tf1 = find("#tf1", c);
        Platform.runLater(() -> tf1.setText(""));
        TextField tf2 = find("#tf2", c);
        Platform.runLater(() -> tf2.setText(""));
        waitUntil(tf1, hasText(""));
        waitUntil(tf2, hasText(""));
        clickOn(tf1).write(v1);
        clickOn(tf2).write(v2);
        clickOn((Button)find("#btnAdd")).clickOn();
        TextField tfResult = find("#tfResult");
        Assertions.verifyThat(tfResult, hasText(result));
    }


}
