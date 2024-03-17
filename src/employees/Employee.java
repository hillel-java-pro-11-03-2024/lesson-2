package employees;

public class Employee {

  private String fullName;
  private EmployeePosition position;
  private String email;
  private String phone;
  private Integer age;

  public Employee(String fullName, EmployeePosition position, String email, String phone,
      Integer age) {
    this.fullName = fullName;
    this.position = position;
    this.email = email;
    this.phone = phone;
    this.age = age;
  }
}
