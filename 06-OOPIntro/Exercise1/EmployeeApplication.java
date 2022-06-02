public class EmployeeApplication {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.firstName = "Martina";
        emp1.lastName = "Yusuf";
        emp1.department = "HR";
        emp1.employeeId  = 1001;

        emp2.firstName = "John";
        emp2.lastName = "Doe";
        emp2.department = "IT";
        emp2.employeeId  = 1002;

        emp1.introduction();
        emp2.introduction();
    }
}
