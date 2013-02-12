
/**
 * Write a description of class EmployeeTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmployeeTester
{   public static void main(String[] args)
{
    Employee harry = new Employee("Hacker, Harry", 50000);
    harry.raiseSalary(10); // Harry gets a 10% raise
    System.out.println( harry.getName() +" is now making $" + harry.getSalary());
}}
