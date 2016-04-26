package nwo.stqa.addressbook.tests;

import nwo.stqa.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContactModification() {
    app.getContactsHelper().initContactUpdate();
    app.getContactsHelper().fillContacForm(new ContactData("test2", "test2", "test2", "123"));
    app.getContactsHelper().submitContactModification();
    app.getNavigationHelper().returnToContactPage();
  }
}
