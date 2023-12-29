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

public class QuestionBank {
    private List<Question> easyQuestions;
    private List<Question> mediumQuestions;
    private List<Question> hardQuestions;

    public QuestionBank() {
        this.easyQuestions = new ArrayList<>();
        this.mediumQuestions = new ArrayList<>();
        this.hardQuestions = new ArrayList<>();
    }

    public void addQuestion(String difficulty, Question question) {
        if (question == null) {
            System.out.println("Error: Cannot add null question.");
            return;
        }

        switch (difficulty) {
            case "easy":
                easyQuestions.add(question);
                break;
            case "medium":
                mediumQuestions.add(question);
                break;
            case "hard":
                hardQuestions.add(question);
                break;
            default:
                System.out.println("Error: Invalid difficulty level.");
                break;
        }
    }

    public void removeQuestion(String difficulty, Question question) {
        if (question == null) {
            System.out.println("Error: Cannot remove null question.");
            return;
        }

        switch (difficulty) {
            case "easy":
                easyQuestions.remove(question);
                break;
            case "medium":
                mediumQuestions.remove(question);
                break;
            case "hard":
                hardQuestions.remove(question);
                break;
            default:
                System.out.println("Error: Invalid difficulty level.");
                break;
        }
    }

    public Question getQuestion(String difficulty) {
        switch (difficulty) {
            case "easy":
                if (!easyQuestions.isEmpty()) {
                    return easyQuestions.get(0); 
                }
                break;
            case "medium":
                if (!mediumQuestions.isEmpty()) {
                    return mediumQuestions.get(0); 
                }
                break;
            case "hard":
                if (!hardQuestions.isEmpty()) {
                    return hardQuestions.get(0); 
                }
                break;
            default:
                System.out.println("Error: Invalid difficulty level.");
                break;
        }

       
        return new Question("Placeholder", "Placeholder", Question.DifficultyLevel.EASY);
    }
}
