package testfx.junit.org.rapidpm.demo.jdkio2015.v005.fx.main.edit;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.junit.Assert;
import org.junit.Test;
import org.loadui.testfx.Assertions;
import org.loadui.testfx.GuiTest;
import org.rapidpm.demo.jdkio2015.v005.fx.main.edit.EditPane;

import static org.loadui.testfx.controls.Commons.hasText;

/**
 * Created by Sven Ruppert on 01.10.2014.
 */
public class EditPaneTest01 extends GuiTest {

  @Override
  protected Parent getRootNode() {
    return new EditPane();
  }

  @Test
  public void testMainButton01() throws Exception {
    final Label lb = find("#lb");
    Assert.assertNotNull(lb);
    Assertions.verifyThat(lb, hasText("Hello Edit"));

    final Button btn = find("#btn");
    Assert.assertNotNull(btn);
    Assertions.verifyThat(btn, hasText("Edit Button"));

  }
  @Test
  public void testMainButton02() throws Exception {
    final Button btn = find("#btn");

    clickOn(btn);
    Assertions.verifyThat(btn, hasText("Edit pressed 0"));
    clickOn(btn);
    Assertions.verifyThat(btn, hasText("Edit pressed 1"));
  }


}
