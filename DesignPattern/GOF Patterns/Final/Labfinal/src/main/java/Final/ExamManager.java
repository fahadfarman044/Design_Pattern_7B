/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final;

import java.time.LocalDateTime;

/**
 *
 * @author DELL
 */
import java.time.LocalDateTime;

public class ExamManager {
    private boolean isExamInProgress = false;
    private LocalDateTime examDateTime;
    private String conductionDetails;

    public void startExam() {
        if (!isExamInProgress) {
            System.out.println("Exam started");
            isExamInProgress = true;
        } else {
            System.out.println("Error: Exam is already in progress");
        }
    }

    public void stopExam() {
        if (isExamInProgress) {
            System.out.println("Exam stopped");
            isExamInProgress = false;
        } else {
            System.out.println("Error: No exam in progress to stop");
        }
    }

    public void rescheduleExam(LocalDateTime newDateTime) {
        if (!isExamInProgress) {
            examDateTime = newDateTime;
            System.out.println("Exam rescheduled to: " + newDateTime);
        } else {
            System.out.println("Error: Cannot reschedule exam in progress");
        }
    }

    public void conductExam() {
        if (isExamInProgress) {
            System.out.println("Conducting exam");
            // Additional logic for conducting the exam
        } else {
            System.out.println("Error: No exam in progress to conduct");
        }
    }

    public void setExamSchedule(LocalDateTime examDateTime) {
        // Additional logic for setting exam schedule
        this.examDateTime = examDateTime;
        System.out.println("Exam schedule set for: " + examDateTime);
    }

    public void setConductionDetails(String location) {
        // Additional logic for setting conduction details
        this.conductionDetails = location;
        System.out.println("Conduction details set for location: " + location);
    }
}
