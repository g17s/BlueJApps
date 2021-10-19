
/**
 * The module class contains data such as the module code, module title and module credit value
 *
 * @author George Smith
 * @version v2.0.1 04/10/2021
 */
public class Module
{
    // sets a variable called moduleCode
    private String moduleCode;
    // sets a variable called moduleTitle
    private String moduleTitle;
    // sets a variable called moduleCredit
    private int moduleCredit;
    /**
     * Constructor for objects of class Module
     */
    public Module(String moduleCode,String moduleTitle)
    {
        this.moduleCode = moduleCode;
        this.moduleTitle = moduleTitle;

        moduleCredit = 0;
    }

    /**
     * Gets the value of moduleCode
     */
    public String getModuleCode()
    {
        return this.moduleCode;
    }

    /**
     * Gets the value of moduleTitle
     */
    public String getModuleTitle()
    {
        return  this.moduleTitle;
    }

    /**
     * Gets the value of moduleCredit
     */
    public int getModuleCredit()
    {
        return this.moduleCredit;
    }

    /**
     * Gets the module credit
     */
    public void setModuleCredit(int moduleCredit)
    {
        this.moduleCredit = moduleCredit;
    }

    /**
     * Prints the module deatils such as module code and credits
     */ public void printModuleDetails()
    {
        System.out.println("}=------------------={");
        System.out.println(moduleCode + " " + moduleTitle);
        System.out.println("Module credit: " + moduleCredit);
        System.out.println("}=------------------={");
    }
}
