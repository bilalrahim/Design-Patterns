package prac;
import java.util.ArrayList;
/**
 * Calculates Average using standard algorithm.
 * @author Bilal
 *
 */
public class AvgA extends CalAvg{
	public AvgA(ArrayList<Double> assignments, ArrayList<Double> exams) {
		super(assignments, exams);
		// TODO Auto-generated constructor stub
	}
	/**
	 * method to calculate average using algorithm 1.
	 */
	
	public double calculateAverage() {
		double average;
        average = (exam_weight * (totalExamsScore()/exams.size())) +
                (assign_weight * (totalAssignScore()/assign.size()));
        return average;

	}

}
