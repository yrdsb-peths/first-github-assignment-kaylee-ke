public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private int gpa;
    private int age;
    
    public Student(String fName, String lName, int grade, int theGPA, int theAge)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        gpa = theGPA;
        age = theAge
    }
    
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}
