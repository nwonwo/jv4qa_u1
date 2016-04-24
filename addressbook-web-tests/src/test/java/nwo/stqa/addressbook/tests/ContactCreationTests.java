package nwo.stqa.addressbook.tests;

import nwo.stqa.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getContactsHelper().initCreateContact();
    app.getContactsHelper().fillContacForm(new ContactData("test2", "test2", "test2", "123"));
    app.getContactsHelper().submitContactCreation();
    app.getNavigationHelper().returnToContactPage();
  }

}
