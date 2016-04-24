package nwo.stqa.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    initCreateContact();
    fillContacForm(new ContactData("test2", "test2", "test2", "123"));
    submitContactCreation();
    returnToContactPage();
  }

}
