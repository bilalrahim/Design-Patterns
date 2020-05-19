package prac;
import java.util.ArrayList;
/**
 * Class to calculate Average by dropping lowest assignment.
 * @author Bilal
 *
 */
public class AvgB extends CalAvg{
	public AvgB(ArrayList<Double> assignments, ArrayList<Double> exams) {
		super(assignments, exams);
		// TODO Auto-generated constructor stub
	}
	/**
	 * method to calculate average using algorithm 2.
	 */
	
	public double calculateAverage() {
		double average;
		average = (exam_weight * (totalExamsScore()/exams.size()) +
                (assign_weight * ((totalAssignScore() -
                        assign.get(findLowestAssign()))/(assign.size()-1))));
        return average;

	}

}
