/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final;

/**
 *
 * @author DELL
 */
public class ExamRoom {
    public ExamResult conductExam(Exam exam) {
        if (exam == null || exam.getQuestions().isEmpty()) {
            System.out.println("Error: Cannot conduct exam without questions");
            return new ExamResult(0, "Invalid");
        }

       
        float totalMarks = 100; 

       

       
        totalMarks = (float) (Math.random() * 100);

        
        String status = (totalMarks >= 50) ? "Pass" : "Fail";

        
        return new ExamResult(totalMarks, status);
    }
}
