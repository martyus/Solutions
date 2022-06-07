public class EmployeeApplication {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Martina", "Yusuf", "HR", 1001, 21);
        Employee emp2 = new Employee("John", "Doe", "IT", 1002, 25);

        //emp1.introduction();
        //emp2.introduction();

        Manager manager = new Manager("Santa", 67);
        //manager.introduction();

        Employee[] employees = {emp1, emp2, manager};

        manager.addEmployee(emp1);
        manager.addEmployee(emp2);

        for (int i=0; i<employees.length; i++){
            System.out.println(employees[i]);
        }

        Manager manager2 = new Manager("Tooth Fairy", 18);
        Employee emp3 = new Employee("Tooth Fairy Apprentice", 16);
        manager2.addEmployee(emp3);

        Manager superManager = new Manager("Queen Sparklewings", 25);
        superManager.addEmployee(manager);
        superManager.addEmployee(manager2);

        System.out.println(superManager);
    }
}
