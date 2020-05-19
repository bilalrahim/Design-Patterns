package prac;

import java.util.ArrayList;

/**
 * Represents a student and their scores in a class.
 * Stores the name, assignment scores and exam scores.
 * @author Bilal Rahim
 *
 */
public class Student {

    private String            name;                    
    private ArrayList<Double> assignments;  
    private ArrayList<Double> exams;        
    private GradeTracker      observer;
    private boolean              avgSelect ;
	/**
	 * Constructs the student from their name
	 * @param name  full name of the student.
	 */
	public Student(String name) {
		this.name = name;
        assignments = new ArrayList<Double>();
        exams = new ArrayList<Double>();
        observer = new GradeTracker();
        
	}

	/**
	 * @return the student's full name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Adds an assignment score to the collection of assignment scores for the student.
	 * @param as the assignment score to add
	 */
	public void addAssignmentScore (double as) {
		assignments.add(as);
	
	}
	/**
	 * Adds an exam score to the collection of exam scores for the student.
	 * @param es the exam score to add
	 */
	public void addExamScore (double es) {
		exams.add(es);
	
	}
	
	public void notifyObservers(double averageGrade) {
		observer.update(averageGrade);
	}
	public double getAvg() {
		double averageGrade = -1; // -1 Means error!
		if (!avgSelect) {
			// Select 60/40 average grade algorithm
			AvgA grade = new AvgA(assignments, exams);
			averageGrade = grade.calculateAverage();
		} else {
			// Select the 60/40 (drop) average grade algorithm
			if (assignments.size() >= 2) {
				AvgB grade = new AvgB(assignments, exams);
				averageGrade = grade.calculateAverage();
			} else {
				System.out.println("Cannot drop lowest! Must have at least" +
						"2 assignments posted.");
			}
		}
		// Notify avgObserver of change to subject.
		
		notifyObservers(averageGrade);
		return averageGrade;
		
	}
	public void setAlgo(boolean avgSelect) {
		
		if(avgSelect==true) {
			this.avgSelect = false;
		}
		else
		{
			this.avgSelect = true;
		}
		
	}
	public String getLetterGrade() {
		return observer.getLetterGrade();
	}

}
