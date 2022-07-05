public class UnderAgeException extends Exception{
    public int getAge() {
        return age;
    }

    private int age;

    public UnderAgeException(int age, String message){
        super(message);
        this.age = age;
    }

}
