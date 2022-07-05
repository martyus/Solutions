import java.io.*;

public class EmployeeFileMain {

    public static final String FILE_PATH = "./src/main/java/Employee.txt";

    public static void main(String[] args) {
        try{
            inputEmployee();
        }catch(IOException e){
            System.out.println("Problem occurred");
        }catch(NumberFormatException e ){
            System.out.println(e.getMessage() + "is invalid age!");
        }
        catch(UnderAgeException e){
            System.out.println(e.getAge() + "is too young!!");
        }


//        try{
//            showEmployees();
//        }
//        catch(FileNotFoundException e){
//            System.out.println("file not found");
//        }
//        catch(IOException e){
//            System.out.println("IOException");
//        }

    }

    public static void showEmployees() throws IOException{
        FileInputStream fis = new FileInputStream(FILE_PATH);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String data = "";
        while (data!= null){
            data = br.readLine();
            System.out.println(data);
        }
        br.close();
    }

    public static Employee createEmployee(String fname, String lname, String strage) throws NumberFormatException, UnderAgeException{
        int age = Integer.parseInt(strage);
        if (age <18){
            throw new UnderAgeException(age, "Underage!!");
        }
        Employee e = new Employee(fname, lname, age);
        return e;
    }

    public static void inputEmployee() throws IOException, NumberFormatException, UnderAgeException{
        String fname = getInput("What's the first name of the employee?");
        String lname = getInput("What's the last name of the employee?");
        String strage = getInput("What's their age?");
        Employee e = createEmployee(fname, lname, strage);
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.append(e.getFullName() +" , " + e.getAge());
        bw.close();
    }

    public static String getInput(String question) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println(question);
        String answer = br.readLine();
        return answer;
    }
}
