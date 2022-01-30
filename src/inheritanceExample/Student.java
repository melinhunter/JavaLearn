package inheritanceExample;

public class Student extends Person{
    String studentId;
    
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Student(String firstName, String lastName, String dtudentId){
        super(firstName, lastName);
        this.studentId = dtudentId;
    }

    @Override
    public String toString() {
        return super.toString() + " student ID " + studentId;
    }
}
