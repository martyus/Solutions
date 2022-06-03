public class Employee {
    //attributes
    private String firstName;
    private String lastName;
    private String department;
    private int employeeId;
    private int age;

    //constructor
    public Employee(String empFName, String empLNmae, String dept, int id, int empAge) {
        firstName = empFName;
        lastName = empLNmae;
        department = dept;
        employeeId = id;
        age = empAge;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public void introduction(){
        System.out.println("Full name: " + getFullName());
        System.out.println("Department: " + department);
        System.out.println("Id: " + employeeId);
        System.out.println("Age: " + age);
    }

    public void incAge(){
        if(age<65){
            age++;
        }
    }

    //getter
    public int getAge() {
        return age;
    }
}
