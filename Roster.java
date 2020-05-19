package prac;

import java.util.*;

/**
 * Represents a class of students.
 * @author Bilal Rahim
 *
 */
public class Roster {
    
    private String courseName;             // Class name
    private String courseNumber;           // Course number, like cs2308
    private ArrayList<Student> students;   // list of students in the course
    
    /**
     * Constructs the roster from its name and number
     * @param name   the course name.
     * @param number the course number.
     */
    public Roster(String name, String number) {
        this.courseName = name;
        this.courseNumber = number;
        students = new ArrayList<Student>();
    }
    
    /**
     * @return the course name.
     */
    public String getCourseName() {
        return courseName;
    }
    
    /**
     * Adds a Student to the list.
     * @param student the Student to add
     */
    public void addStudent (Student student) {
        students.add(student);
    }
    public AvgDispenser getDispenser() {

        // Create anonymous class to carry out AvgDispenser Interface.
        return new AvgDispenser() {

            // Create list iterator to traverse roster of students.
            ListIterator<Student> rosterIterator = students.listIterator();

            /**
             * @return average of current student from roster.
             */
            public double getNextAvg() {
                return rosterIterator.next().getAvg();
            }
            /**
             * @return boolean indicates whether Iterator from getNextAvg()
             * is on last element of class Roster.
             */
            @Override
            public boolean done() {
                return !rosterIterator.hasNext();
            }
			
        };
    }


    
}
