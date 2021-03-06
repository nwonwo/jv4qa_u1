package nwo.stqa.addressbook.appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends BaseHelper {

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
    click(By.linkText("groups"));
  }

  public void returnToContactPage() {
    click(By.linkText("home page"));
  }
  public void returnToHomePage() {
    click(By.linkText("home"));
  }
}
