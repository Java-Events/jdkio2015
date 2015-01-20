package org.rapidpm.demo.jdkio2015.fxcdi.mocked;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.junit.Assert;
import org.junit.Test;
import org.loadui.testfx.Assertions;
import org.loadui.testfx.utils.FXTestUtils;
import org.rapidpm.demo.jdkio2015.fxcdi.CDIGuiTest;
import org.rapidpm.demo.jdkio2015.fxcdi.MainContext;
import org.rapidpm.demo.jdkio2015.fxcdi.main.MainPane;
import org.rapidpm.demo.jdkio2015.fxcdi.main.edit.EditPane;
import org.rapidpm.demo.jdkio2015.fxcdi.main.edit.EditPaneController;

import javax.inject.Inject;

import static org.loadui.testfx.controls.Commons.hasText;

/**
 * Created by Sven Ruppert on 30.09.2014.
 */
public class MockedTest extends CDIGuiTest {

  @Inject MainContext context;

  @Override
  protected Parent getRootNode() {
    return new MainPane();
  }


  @Test
  public void testMockedBusinessLogic01() throws Exception {
    final EditPane editPane = find("#editPane");
    Assert.assertNotNull(editPane);

    final EditPaneController controller = editPane.getController();

    context.setBusinessSubLogicMocked(true);
    context.setBusinessLogicMocked(true);
    controller.reconfigure();
    runTheTest(editPane, controller, "BusinessLogicMocked BusinessSubLogicMocked used 1");

    context.setBusinessSubLogicMocked(false);
    context.setBusinessLogicMocked(true);
    controller.reconfigure();
    runTheTest(editPane, controller, "BusinessLogicMocked BusinessSubLogicImpl used 1");

    context.setBusinessSubLogicMocked(false);
    context.setBusinessLogicMocked(false);
    controller.reconfigure();
    runTheTest(editPane, controller, "BusinessLogicImpl BusinessSubLogicImpl used 1");
    runTheTest(editPane, controller, "BusinessLogicImpl BusinessSubLogicImpl used 3");

  }

  private void runTheTest(EditPane editPane, EditPaneController controller, String text) throws Exception {
    FXTestUtils.invokeAndWait(controller::useService, 1); //Service used 0

    final Label editPaneLabel = find("#lb", editPane);
    Assert.assertNotNull(editPaneLabel);

    final Button btnMain = find("#btn",find("#mainPane"));
    clickOn(btnMain);

    Assertions.verifyThat(editPaneLabel, hasText(text));




  }
}
