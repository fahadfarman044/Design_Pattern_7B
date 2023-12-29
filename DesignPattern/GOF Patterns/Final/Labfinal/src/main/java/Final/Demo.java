/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final;

/**
 *
 * @author DELL
 */
public class Demo {
    public static void main(String[] args) {
        // Create instances
        Student student = new Student("John Doe");
        Teacher teacher = new Teacher();
        QuestionBank questionBank = new QuestionBank();
        ExamRoom examRoom = new ExamRoom();
        ExamSystem examSystem = ExamSystem.getInstance();
        StudentProgressTracker progressTracker = new StudentProgressTracker();

        // Register observers
        examSystem.registerObserver(teacher);
        examSystem.registerObserver(progressTracker);

        // Set questions in the question bank
        Question easyQuestion = new Question("What is the capital of Italy?", "Rome", Question.DifficultyLevel.EASY);
        Question mediumQuestion = new Question("Solve for y: 3y + 8 = 20", "4", Question.DifficultyLevel.MEDIUM);
        Question hardQuestion = new Question("What is the largest prime number less than 100?", "97", Question.DifficultyLevel.HARD);

        questionBank.addQuestion("easy", easyQuestion);
        questionBank.addQuestion("medium", mediumQuestion);
        questionBank.addQuestion("hard", hardQuestion);

        // Student takes an exam
        Exam exam = new Exam();
        exam.setStudent(student);
        exam.setQuestions(questionBank.getQuestion("easy"), questionBank.getQuestion("medium"), questionBank.getQuestion("hard"));

        ExamResult result = examRoom.conductExam(exam);
        student.updateProgress(result); // Assuming Student has a method to update progress

        // Notify observers about the exam result
        examSystem.notifyTeachers(result);
        examSystem.notifyParents(result);

        // Teacher sets exam questions
        teacher.setExamQuestions(exam, "medium");

        // Teacher reschedules the exam
        teacher.rescheduleExam();
    }
}
