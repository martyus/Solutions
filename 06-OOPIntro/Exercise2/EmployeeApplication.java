public class EmployeeApplication {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Martina", "Yusuf", "HR", 1001, 21);
        Employee emp2 = new Employee("John", "Doe", "IT", 1002, 25);

        emp1.introduction();
        emp2.introduction();

        //see the output, the age is not incremented past 65
        for(int i=0; i<70; i++ ){
            emp1.incAge();
            System.out.println(emp1.getAge());
        }
    }
}
