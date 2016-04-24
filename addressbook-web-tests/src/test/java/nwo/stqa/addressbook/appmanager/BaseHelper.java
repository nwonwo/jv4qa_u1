package nwo.stqa.addressbook.appmanager;

import nwo.stqa.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseHelper {
  private FirefoxDriver wd;

  public BaseHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  protected void setGroupFooter(GroupData groupData) {
    wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  protected void selectGroupFooter() {
    wd.findElement(By.name("group_footer")).click();
    wd.findElement(By.name("group_footer")).clear();
  }

  protected void setGroupHeader(GroupData groupData) {
    wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
  }

  protected void selectGroupHeader() {
    wd.findElement(By.name("group_header")).click();
    wd.findElement(By.name("group_header")).clear();
  }

  protected void setGroupName(GroupData groupData) {
    wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
  }

  protected void selectGroupName() {
    wd.findElement(By.name("group_name")).click();
    wd.findElement(By.name("group_name")).clear();
  }
}
