package nwo.stqa.addressbook;

import org.testng.annotations.Test;
public class testGroupCreation extends TestBase {

  @Test
  public void GroupCreationTests() {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
