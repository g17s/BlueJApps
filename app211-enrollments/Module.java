
/**
 * The module class contains data such as the module code, module title and module credit value
 *
 * @author George Smith
 * @version v2.0.1 04/10/2021
 */
public class Module
{
    // instance variables - replace the example below with your own
    private int x;

    private String moduleCode;

    private String moduleTitle;

    private int moduleCredit;
    /**
     * Constructor for objects of class Module
     */
    public Module()
    {
        // initialise instance variables

    }

    public String getModuleCode()
    {
        return moduleCode;
    }

    public String getModuleTitle()
    {
        return  moduleTitle;
    }

    public int getModuleCredit()
    {
        return moduleCredit;
    }

    public void setModuleCredit(int moduleCredit){
        this.moduleCredit = moduleCredit;
    }

    public void printModuleDetails(){
        System.out.println("}=------------------={");
        System.out.println(moduleCode + " " + moduleTitle);
        System.out.println("Module credit: " + moduleCredit);
        System.out.println("}=------------------={");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
