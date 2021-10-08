import java.util.*;

/**
 * This class contains information about an undergraduate course
 * at BNU together with a list of student who are enrolled
 *
 * @author Derek Peacock
 * @modified by George Smith
 * @version v2.0.1 04/10/2021
 */
public class Course
{
    // A unique identifier e.g. BT1CTG1
    private String code;
    // The full title including qualification and subject
    private String title;

    private Module module;
    
    private Module moduleTitle;
    
    private Module moduleCode;

    /**
     * Create a Course with a maximum number of enrolments. 
     * All other details are set to unkown values.
     */
    public Course(String code, String title)
    {
        this.code = code;
        this.title = title;
    }

    /**
     * Print the details of the course, the list
     * of students enrolled and the module
     */
    public void printTitle(String moduleTitle, String moduleCode)
    {
        //printHeading();

        System.out.println("Course: " + code + ": " + title);
        System.out.println("Module: " + module.getModuleCode() + " " + module.getModuleTitle());
        System.out.println();
    }

    /**
     * Print out the details of the course to the terminal.
     */
    private void printHeading()
    {
        System.out.println(" --------------------------------");
        System.out.println("   App211: Course Details");
        System.out.println(" --------------------------------");
        System.out.println();
    }

    private void addModule()
    {
        this.module = module;
        this.moduleTitle = moduleTitle;
        this.moduleCode = moduleCode;
    }
}
