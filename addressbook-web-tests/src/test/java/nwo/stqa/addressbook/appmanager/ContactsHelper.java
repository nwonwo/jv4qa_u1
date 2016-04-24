package nwo.stqa.addressbook.appmanager;


import nwo.stqa.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactsHelper extends BaseHelper {

  public ContactsHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContacForm(ContactData contactData) {
    click(By.name("firstname"));
    type(By.name("firstname"), contactData.getFirstname());
    click(By.name("lastname"));
    type(By.name("lastname"), contactData.getLastname());
    click(By.name("address"));
    type(By.name("address"), contactData.getAddress());
    click(By.name("mobile"));
    type(By.name("mobile"),contactData.getMobile());
  }

  public void initCreateContact() {
    click(By.linkText("add new"));
  }
}
