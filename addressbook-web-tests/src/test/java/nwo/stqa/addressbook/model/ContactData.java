package nwo.stqa.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String lastname;
  private final String address;
  private final String mobile;

  public ContactData(String firstname, String lastname, String address, String mobile) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.address = address;
    this.mobile = mobile;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAddress() {
    return address;
  }

  public String getMobile() {
    return mobile;
  }
}
