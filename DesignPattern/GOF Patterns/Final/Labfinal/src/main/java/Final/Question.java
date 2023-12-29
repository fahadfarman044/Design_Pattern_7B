/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final;

/**
 *
 * @author DELL
 */
public class Question {
    private String text;
    private String answer;
    private DifficultyLevel difficultyLevel;

    public enum DifficultyLevel {
        EASY, MEDIUM, HARD
    }

    public Question(String text, String answer, DifficultyLevel difficultyLevel) {
        this.text = text;
        this.answer = answer;
        this.difficultyLevel = difficultyLevel;
    }

    public String getText() {
        return text;
    }

    public String getAnswer() {
        return answer;
    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }
}
