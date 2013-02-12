public class Employee
{
    private String name;
    private double salary;
    
    /**
     * Constructor for objects of class EmployeeTester
     */
    public Employee(String employeeName, double currentSalary)
    {
        name = employeeName;
        salary = currentSalary;
    }
    
    public String getName()
    {
      String title = name;
      return name;
    }
    
    public void raiseSalary(double byPercent)
    {
        salary = salary * byPercent/100 + salary;
    }

    public double getSalary()
    {
        return salary;
    }
    
}
