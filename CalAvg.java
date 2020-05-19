package prac;
import java.util.ArrayList;

/**
 * This abstract class to for calculatiing average/
 * subclasses are AvgA and AvgB
 * @author Bilal Rahim
 */
abstract public class CalAvg {

    static double exam_weight = .60; // Exam worth of total grade.
    static double assign_weight = .40; // Assignment worth of total grade.
    static double max_grade = 100.00; // Highest possible numerical grade.
    static ArrayList<Double> assign;
    static ArrayList<Double> exams;


    public CalAvg(ArrayList<Double> assignments, ArrayList<Double> examsss){
        assign = assignments;
        exams = examsss;
    }

    /**
     * Calculates the total exam scores for a student exams list.
     * @author Bilal Rahim
     * @return totalExams the total score for all of the student's exams
     */
    public double totalExamsScore(){
        double totalExams = 0;
        for (double exam : exams) {
            totalExams += exam;
        }
        return totalExams;
    }

    /**
     * Calculates the total exam scores for a student assignments list.
     * @author Bilal Rahim
     * @return totalAssign the total score for all of the student's assignments
     */
    public double totalAssignScore(){
        double totalAssign = 0;
        for (double assignment : assign) {
            totalAssign += assignment;
        }
        return totalAssign;
    }
    /**
     * Traverses the student's assignments and finds the lowest grade and
     * returns the index to it in the assignments list back to the caller.
     * @author Bilal Rahim
     * @return indexLowest index of the student's lowest assignment grade
     */
    public int findLowestAssign(){
        double lowest = max_grade;
        int indexLowest = 0;
        for (double assignment : assign){
            if(assignment < lowest){
                indexLowest = assign.indexOf(assignment);
                lowest = assignment;
            }
        }
        return indexLowest;
    }

    /**
     * This abstract method is defined in sub-classes and calculates the
     * student's current average grade based on sub-classes defined
     * method.
     * @return averageGrade student's current grade averaged.
     */
    abstract public double calculateAverage();
}