public class Employee {
    String firstName;
    String lastName;
    String department;
    int employeeId;

    String getFullName(){
        return firstName + " " + lastName;
    }

    void introduction(){
        System.out.println("Full name: " + getFullName());
        System.out.println("Department: " + department);
        System.out.println("Id: " + employeeId);
    }
}
