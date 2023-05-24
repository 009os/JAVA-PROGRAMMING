//Design a class employee of an organization. An employee has a name, empid, and salary.
//Write the default constructor, a constructor with parameters (name, empid, and salary) and methods to return name and salary. 
//Also write a method increase Salary that raises the employee’s salary by a certain user specified percentage.
//Derive a subclass Manager from employee. 
//Add an instance variable named department to the manager class. Supply a test program that uses theses classes and methods.
class Employee {
    private String name;
    private int empid;
    private double salary;

    public Employee() {
        name = "";
        empid = 0;
        salary = 0;
    }

    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        salary *= (1 + percentage / 100);
    }
}

class Manager extends Employee {
    private String department;

    // Constructor with parameters
    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }

    // Getter method
    public String getDepartment() {
        return department;
    }
}

// Test program
public class Q5 {
    public static void main(String[] args) {
        // Create an employee and print their name and salary
        Employee employee = new Employee("John", 123, 50000);
        System.out.println("Employee: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());

        // Increase the employee's salary by 10% and print it
        employee.increaseSalary(10);
        System.out.println("New salary: " + employee.getSalary());

        // Create a manager and print their name, salary, and department
        Manager manager = new Manager("Jane", 456, 80000, "Sales");
        System.out.println("Manager: " + manager.getName());
        System.out.println("Salary: " + manager.getSalary());
        System.out.println("Department: " + manager.getDepartment());
    }
}
