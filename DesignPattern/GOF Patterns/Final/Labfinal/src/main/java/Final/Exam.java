/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final;



/**
 *
 * @author DELL
 */

import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class Exam {
    private List<Question> questions;

    public Exam() {
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        if (question != null && !questions.contains(question)) {
            questions.add(question);
            System.out.println("Question added to the exam: " + question.getText());
        } else {
            System.out.println("Error: Cannot add null question or duplicate question.");
        }
    }

    public void removeQuestion(Question question) {
        if (question != null && questions.contains(question)) {
            questions.remove(question);
            System.out.println("Question removed from the exam: " + question.getText());
        } else {
            System.out.println("Error: Cannot remove null question or question not found in the exam.");
        }
    }

    public List<Question> getQuestions() {
        return new ArrayList<>(questions); 
    }

    void setQuestions(List<Question> questions) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setStudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setQuestions(Question question, Question question0, Question question1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

