/**
 * The Student class contains essential information that identifies 
 * a student at BNU.  The class also contains information 
 * concerning the course the student is currently enrolled on
 * 
 * @author Michael Kölling and David Barnes
 * @modified by George Smith
 * @version v2.0.1 04/10/2021
 */
public class Student
{
    // A unique 8 digit BNU identifier
    private int id;
    // the student's full name
    private String name;
    // The course the student is enrolled on
    private Course course;
    
    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    /**
     * Gets the students name
     */
    public String getName()
    {
        return name;
    }

     /**
     * Gets the students ID
     */
    public int getID()
    {
        return id;
    }

    /**
     * Enrols a student on a course
       */
    public void enrol(Course course)
    {
        this.course = course;
    }
    
    /**
     * Print the student's name and ID number to the output terminal
     */
    public void printStudentDetails()
    {
        System.out.println(" Student ID: " + id + " Name: " + name);
    }
}
