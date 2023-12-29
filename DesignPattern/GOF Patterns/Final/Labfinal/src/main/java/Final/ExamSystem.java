/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final;

/**
 *
 * @author DELL
 */
public class ExamSystem {
    private static ExamSystem instance;

    private ExamSystem() {
       
    }

    public static ExamSystem getInstance() {
        if (instance == null) {
            instance = new ExamSystem();
        }
        return instance;
    }

    public void manageExams() {
      
        System.out.println("Exam management logic here.");
    }

    public void notifyTeachers(ExamResult result) {
       
        System.out.println("Notifying teachers about exam result: " + result.getMarks() + " - " + result.getStatus());
    }

    public void notifyParents(ExamResult result) {
       
        System.out.println("Notifying parents about exam result: " + result.getMarks() + " - " + result.getStatus());
    }

    public void notifyProgress(Student student, String progress) {
        
        System.out.println("Notifying progress for student " + student.getName() + ": " + progress);
    }

    void registerObserver(Teacher teacher) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void registerObserver(StudentProgressTracker progressTracker) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
