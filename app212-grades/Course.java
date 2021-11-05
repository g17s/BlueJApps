import java.util.ArrayList;
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author George Smith
 * @version 26/10/2021
 */
public class Course
{
    public final static int MAXN_MODULES = 4;

    public ArrayList<Module> modules;

    private String code;
    private String title;

    private Grades finalGrade;

    public Course()
    {
        this("G400", "BSc Digital Technology Solutions");
    }

    /**
     * Constructor for objects of class Course
     */
    public Course(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;

        modules  = new ArrayList<Module>();

        createModules();
    }

    /**
     * Create four modules and add them to the
     * modules list for testing purposes.  These
     * must be your four modules.
     */
    public void createModules()
    {

    }

    public void addModule(Module module)
    {
        if(modules.size() < MAXN_MODULES)
        {
            modules.add(module);
        }
    }

    /**
     * 
     */
    public Grades convertToGrade(int mark)
    {
        if(mark >= 0 && mark <=39)
            return Grades.F;
        else if(mark >= 40 && mark <=49)
            return Grades.D;
        else if(mark >= 50 && mark <=59)
            return Grades.D;
        else if(mark >= 60 && mark <=69)
            return Grades.;
        else if(mark >= 70)
            return Grades.A;
        return Grades.NS;
    }

    /**
     * Calculate the average mark from the four module marks
     * and convert that into a final grade.
     */
    public Grades calculateGrade(ArrayList<ModuleMark> marks)
    {
        int total = 0;
        int finalMark = 0;
        for(ModuleMark mark:marks)
        {
            total = total + mark.getValue();
        }

        finalMark = total / MAXN_MODULES;
        return Grades.NS;
    }

    /**
     * Prints out the details of a course and the
     * four modules
     */
    public void print()
    {
        System.out.println();
        System.out.println(" Course " + code + ": " + title);
        //System.out.println();

        printModules();
    }

    /**
     * Print the course's four modules
     */
    public void printModules()
    {
        for (Module module : modules)
        {
            module.print();
            module.printCredit();
        }
    }
}
