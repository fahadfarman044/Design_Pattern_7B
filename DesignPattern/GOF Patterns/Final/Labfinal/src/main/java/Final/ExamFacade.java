/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final;

/**
 *
 * @author DELL
 */
import java.time.LocalDateTime;

public class ExamFacade {
    private ExamManager examManager;

    public ExamFacade(ExamManager examManager) {
        this.examManager = examManager;
    }

    public void setExamSchedule(LocalDateTime examDateTime) {
        // Additional logic for setting exam schedule, e.g., validating the date
        if (examDateTime.isAfter(LocalDateTime.now())) {
            examManager.setExamSchedule(examDateTime);
            System.out.println("Exam schedule set for: " + examDateTime);
        } else {
            System.out.println("Error: Exam schedule must be in the future.");
        }
    }

    public void setConductionDetails(String location) {
        // Additional logic for setting conduction details, e.g., validating the location
        if (location != null && !location.isEmpty()) {
            examManager.setConductionDetails(location);
            System.out.println("Conduction details set for location: " + location);
        } else {
            System.out.println("Error: Invalid conduction details.");
        }
    }
}
