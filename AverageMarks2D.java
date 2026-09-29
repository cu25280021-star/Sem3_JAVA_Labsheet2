public class AverageMarks2D {
    public static void main(String[] args) {
        // 2D Array: Rows = Students, Columns = Subject Marks
        double[][] marks = {
            {85.5, 90.0, 78.0},
            {92.0, 88.5, 95.0},
            {60.0, 72.5, 80.0}
        };

        double totalSum = 0;
        int totalCount = 0;

        int studentIdx = 1;
        for (double[] studentMarks : marks) {
            double studentSum = 0;
            for (double mark : studentMarks) {
                studentSum += mark;
                totalSum += mark;
                totalCount++;
            }
            double studentAvg = studentSum / studentMarks.length;
            System.out.println("Average mark for Student " + studentIdx + ": " + String.format("%.2f", studentAvg));
            studentIdx++;
        }

        double overallAvg = totalSum / totalCount;
        System.out.println("Overall Average Marks: " + String.format("%.2f", overallAvg));
    }
}