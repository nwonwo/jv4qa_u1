package nwo.stqa.addressbook;

import org.testng.annotations.Test;

public class testGroupDeletion extends TestBase {

  @Test
  public void testGroupDeletion() {
    gotoGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }

}
