package nwo.stqa.addressbook.appmanager;

import nwo.stqa.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactsBaseHelper {
  private FirefoxDriver wd;

  public ContactsBaseHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  protected void setMobile(ContactData contactData) {
    wd.findElement(By.name("mobile")).sendKeys(contactData.getMobile());
  }

  protected void selectMobile() {
    wd.findElement(By.name("mobile")).click();
    wd.findElement(By.name("mobile")).clear();
  }

  protected void setAddress(ContactData contactData) {
    wd.findElement(By.name("address")).sendKeys(contactData.getAddress());
  }

  protected void selectAddress() {
    wd.findElement(By.name("address")).click();
    wd.findElement(By.name("address")).clear();
  }

  protected void setLastName(ContactData contactData) {
    wd.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
  }

  protected void selectLastName() {
    wd.findElement(By.name("lastname")).click();
    wd.findElement(By.name("lastname")).clear();
  }

  protected void setFirstName(ContactData contactData) {
    wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
  }

  protected void selectFirstName() {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
  }
}
