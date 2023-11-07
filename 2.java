public class Employee {
  private int id;
  private String name;  
  private double salary;

  public Employee(int id,String name, double salary) {
    this.name = name;
    this.id = id;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getid() {
    return id;
  }

  public void setid(int id) {
    this.id = id;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void raiseSalary(double percentage) {
    salary = salary + salary * percentage / 100;
  }

  public void printEmployeeDetails() {
 System.out.println("employee id: " + id);   
 System.out.println("Name: " + name);
   
    System.out.println("Salary: " + salary);
  }
}