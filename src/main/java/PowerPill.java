
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill
{
    public static final int  DEFAULT_POWER = 10;
    public int power;
    public String name;

    // constructors
    /**
     \* Initializes this power pill to a default power value
     \* and sets the name of the pill to name.
     \* @param name the name of this power pill.
     */
    public PowerPill(String name)
    {
        power = DEFAULT_POWER;
        this.name = name;
    }
    /**
     * Initializes this power pill to the value of power
     * and sets the name of the pill to name.
     * @param name the name of this power pill
     * @param power the power level of this power pill.
     */
    public PowerPill(String name,int power)
    {
        this.name = name;
        this.power = power;
    }


    /**
     *
     * returns name of current powerpill
     */
    public String getName()
    {
        return name;
    }

    /**
     *
     * returns the value of power
     */
    public int getPower()
    {
        return power;
    }

    /**
     * mutates the value of name
     *
     */
    public void setName(String name)
    {
        this.name = name;
    }

    public void setPower(int power)
    {
        this.power = power;
    }

    // accessor methods

    // mutator methods

    // TODO - replace this line with instruction from step 7

    // toString method
    public String toString()
    {
        return "PowerPill "+ name+" = "+power;
    }

    // TODO - replace this line with instruction from step 8

}