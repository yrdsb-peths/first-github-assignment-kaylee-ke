public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private int gpa;
    
    public Student(String fName, String lName, int grade, int theGPA)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        gpa = theGPA;
    }
    
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}
