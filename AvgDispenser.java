package prac;
/**
 *  Interface to encapsulate the process of dispensing
 *  the average grade of Student object from any given
 *  class Roster.
 *  @author Bilal Rahim.
 */

public interface AvgDispenser
{
    /**
     * @return average of current student from class roster.
     */
    public double getNextAvg();

    /**
     * @return boolean indicates whether Iterator from getNextAvg()
     * is on last element of class roster.
     */
    public boolean done();

	/**
	 * @return average of current student from roster.
	 */

}