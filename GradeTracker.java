package prac;
/**
 * Class acts as an observer of class Student
 * @author Bilal
 *
 */
public class GradeTracker {
	
    
	private String grade;
	
	/*
	 * @param score avg score is sent as args.
	 * assigns letter grade against the score.
	 */
	public void update(double score) {
		if (score >= 90 && score <=100) {
			this.grade = "A";
		}
		if (score >= 80 && score <=90) {
			this.grade = "B";
		}
		if (score >= 70 && score <=80) {
			this.grade = "C";
		}
		if (score <=70) {
			this.grade = "F";
		}
	}
	/*
	 * returns letter grade of a student.
	 */
	public String getLetterGrade() {
		return this.grade;
	}

}
