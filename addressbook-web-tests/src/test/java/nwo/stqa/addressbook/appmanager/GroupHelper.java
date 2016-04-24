package nwo.stqa.addressbook.appmanager;

import nwo.stqa.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHelper {
  private FirefoxDriver wd;

  private BaseHelper baseHelper;

  public GroupHelper(FirefoxDriver wd) {
    this.wd = wd;
    baseHelper = new BaseHelper(wd);
  }

  public void returnToGroupPage() {
    wd.findElement(By.linkText("group page")).click();
  }

  public void submitGroupCreation() {
    wd.findElement(By.name("submit")).click();
  }

  public void fillGroupForm(GroupData groupData) {
    baseHelper.selectGroupName();
    baseHelper.setGroupName(groupData);
    baseHelper.selectGroupHeader();
    baseHelper.setGroupHeader(groupData);
    baseHelper.selectGroupFooter();
    baseHelper.setGroupFooter(groupData);
  }

  public void initGroupCreation() {
    wd.findElement(By.name("new")).click();
  }

  public void deleteSelectedGroups() {
    wd.findElement(By.name("delete")).click();
  }

  public void selectGroup() {
    wd.findElement(By.name("selected[]")).click();
  }

  public BaseHelper getBaseHelper() {
    return baseHelper;
  }
}
