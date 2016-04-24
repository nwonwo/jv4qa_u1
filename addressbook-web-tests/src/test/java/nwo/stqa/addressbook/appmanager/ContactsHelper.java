package nwo.stqa.addressbook.appmanager;


import nwo.stqa.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactsHelper {
  private FirefoxDriver wd;
  private final ContactsBaseHelper contactsBaseHelper;

  public ContactsHelper(FirefoxDriver wd) {
    this.wd = wd;
    contactsBaseHelper = new ContactsBaseHelper(wd);
  }

  public void submitContactCreation() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  public void fillContacForm(ContactData contactData) {
    contactsBaseHelper.selectFirstName();
    contactsBaseHelper.setFirstName(contactData);
    contactsBaseHelper.selectLastName();
    contactsBaseHelper.setLastName(contactData);
    contactsBaseHelper.selectAddress();
    contactsBaseHelper.setAddress(contactData);
    contactsBaseHelper.selectMobile();
    contactsBaseHelper.setMobile(contactData);
  }

  public void initCreateContact() {
    wd.findElement(By.linkText("add new")).click();
  }

  public ContactsBaseHelper getContactsBaseHelper() {
    return contactsBaseHelper;
  }
}
