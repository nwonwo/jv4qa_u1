package nwo.stqa.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.initCreateContact();
    app.fillContacForm(new ContactData("test2", "test2", "test2", "123"));
    app.submitContactCreation();
    app.returnToContactPage();
  }

}
