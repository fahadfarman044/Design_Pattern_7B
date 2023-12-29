/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
import java.util.ArrayList;
import java.util.List;

public class Teacher implements ExamObserver {
    private List<ExamResult> examResults = new ArrayList<>();

    public void notify(ExamResult result) {
       
        System.out.println("Teacher received exam result: " + result.getMarks() + " - " + result.getStatus());
        examResults.add(result);
    }

    public void update(ExamResult result) {
       
        System.out.println("Teacher updated based on exam result: " + result.getMarks() + " - " + result.getStatus());
        examResults.add(result);
    }

    public void setExamQuestions(Exam exam, String difficulty) {
       
        List<Question> questions = generateQuestions(difficulty); // Assuming you have a method to generate questions
        exam.setQuestions(questions);
        System.out.println("Exam questions set for " + difficulty + " difficulty.");
    }

    public void rescheduleExam() {
       
        System.out.println("Exam rescheduled by teacher.");
    }

    private List<Question> generateQuestions(String difficulty) {
        
        List<Question> questions = new ArrayList<>();
       
        return questions;
    }
}
