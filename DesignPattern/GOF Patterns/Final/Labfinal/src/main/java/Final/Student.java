/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final;

/**
 *
 * @author DELL
 */
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public ExamResult takeExam() {
       
        float totalMarks = (float) (Math.random() * 100);
        String status = (totalMarks >= 50) ? "Pass" : "Fail";
        return new ExamResult(totalMarks, status);
    }

    public String getName() {
        return name;
    }

    void updateProgress(ExamResult result) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
