package abstraction.studentSystem;

public class Student {

    private String studentName;
    private String commentary;
    private int studentAge;
    private double studentGrade;


    public Student() { }
    public Student(String studentName, int studentAge, double studentGrade) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGrade = studentGrade;
        this.commentary = getCommentary();
    }

    public String getCommentary() {

        String temp = "Very nice inheritance.person";

        if(this.studentGrade >= 5.5) {
            temp = "Excellent student";
        } else if(this.studentGrade > 3.0) {
            temp = "Average student";
        }

        return temp;
    }

    public String getStudentName() {
        return studentName;
    }


    @Override
    public String toString() {
        return  studentName + " is " +
                studentAge + " years old. " +
                commentary + ".";
    }
}
