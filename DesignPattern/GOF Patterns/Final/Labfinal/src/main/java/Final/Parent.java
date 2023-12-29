/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final;


/**
 *
 * @author DELL
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parent implements ExamObserver {
    private List<ExamResult> examResults = new ArrayList<>();
    private Map<Student, String> studentProgressMap = new HashMap<>();

    public void notify(ExamResult result) {
        
        System.out.println("Parent received exam result: " + result.getMarks() + " - " + result.getStatus());
        examResults.add(result);
    }

    public void update(ExamResult result) {
      
        System.out.println("Parent updated based on exam result: " + result.getMarks() + " - " + result.getStatus());
        examResults.add(result);
    }

    public void checkProgress(Student student) {
       
        if (studentProgressMap.containsKey(student)) {
            String progress = studentProgressMap.get(student);
            System.out.println("Parent checked progress for student " + student.getName() + ": " + progress);
        } else {
            System.out.println("Parent could not find progress information for student " + student.getName());
        }
    }

   
}
