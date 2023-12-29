/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final;

/**
 *
 * @author DELL
 */
public class ExamResult {
    private float marks;
    private String status;

    public ExamResult(float marks, String status) {
        this.marks = marks;
        this.status = status;
    }

    public float getMarks() {
        return marks;
    }

    public String getStatus() {
        return status;
    }

    Student getStudent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
