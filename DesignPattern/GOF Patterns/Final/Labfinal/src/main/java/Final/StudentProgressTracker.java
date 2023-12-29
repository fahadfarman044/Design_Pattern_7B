/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final;

/**
 *
 * @author DELL
 */
import java.util.HashMap;
import java.util.Map;

public class StudentProgressTracker implements ExamObserver {
    private Map<Student, String> studentProgressMap;

    public StudentProgressTracker() {
        this.studentProgressMap = new HashMap<>();
    }

    public void update(ExamResult result) {
        
        Student student = result.getStudent(); 
        if (student != null) {
            float marks = result.getMarks();
            String progress = determineProgress(marks);
            studentProgressMap.put(student, progress);
            System.out.println("Student " + student.getName() + " progress updated: " + progress);
        } else {
            System.out.println("Error: Could not update student progress. Student reference is null.");
        }
    }

    public String getProgress(Student student) {
       
        return studentProgressMap.getOrDefault(student, "Not available");
    }

    private String determineProgress(float marks) {
        
        return (marks >= 50) ? "Good" : "Needs improvement";
    }
}

