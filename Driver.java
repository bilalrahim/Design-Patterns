package prac;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;
/**
 *  Driver to test the Roster/Student classes.
 *  @author Bilal Rahim
 */

public class Driver {
    
	public static void main(String[] args) {

        Student student = new Student("Harry Potter");
        student.addAssignmentScore(98.5);
        student.addAssignmentScore(90.1);
        student.addAssignmentScore(78.3);
        student.addExamScore(95);
        student.addExamScore(87);

        DecimalFormat df = new DecimalFormat("0.0");
        // should use algorithm A by default:
        System.out.println(student.getName() + "  " +
                           df.format(student.getAvg()));
	

        // Algorithm switch:
        	
        Scanner userInput = new Scanner(System.in);
        System.out.println("Select Algorithm A or B");
        String typeOfAlgo = userInput.nextLine();
        if(typeOfAlgo.equals("A") ) {
        	student.setAlgo(true);
        	System.out.println("Student AVG using Standard avg = "+ student.getAvg()); }
        else {
        	student.setAlgo(false);
        	System.out.println("Student AVG using DropAssignment avg = "+ student.getAvg());}
        
        
        
        
        student.addExamScore(33);
        System.out.println("Added an exam score.");
        System.out.println("letter grade: " + student.getLetterGrade());
        
        
        //add a new student
        Student hg = new Student("Hermione Granger");
        hg.addAssignmentScore(96.2);
        hg.addAssignmentScore(98.1);
        hg.addAssignmentScore(99.3);
        hg.addExamScore(95);
        hg.addExamScore(97);
        
        //new roster
        Roster potions = new Roster("Potions","MAG2308");
        potions.addStudent(student);
        potions.addStudent(hg);
        
        //test the roster traversal
        System.out.println("Potions grades:");
        AvgDispenser ad = potions.getDispenser();
        while (!ad.done()) {
            System.out.println("next average "  +
                               df.format(ad.getNextAvg()));
        }
        

    }
	
}
