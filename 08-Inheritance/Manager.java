public class Manager extends Employee{

    public Employee[] manages;

    private int lastFreePos = 0;

    public Manager(String fname, int age){
        //I created a new constructor in Employee
        super(fname, age);
        manages = new Employee[100];
    }

    public void addEmployee(Employee emp){
        manages[lastFreePos] = emp;
        lastFreePos++;
    }

    public String getEmployeeNames(){
        StringBuilder names = new StringBuilder();
        for (int i=0; i<lastFreePos; i++){
            names.append(" " + manages[i].getFullName());
        }
        return names.toString();
    }

    public String toString(){
        return super.toString() + " manages: " + getEmployeeNames();
    }
}
