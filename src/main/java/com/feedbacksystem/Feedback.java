package com.feedbacksystem;

import java.sql.Timestamp;

public class Feedback {
    private int id;
    private int studentId;
    private String subject;
    private String message;
    private Timestamp submittedAt;

    public Feedback() {}

    public Feedback(int id, int studentId, String subject, String message, Timestamp submittedAt) {
        this.id = id;
        this.studentId = studentId;
        this.subject = subject;
        this.message = message;
        this.submittedAt = submittedAt;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public Timestamp getSubmittedAt() { return submittedAt; }
    public void setSubmittedAt(Timestamp submittedAt) { this.submittedAt = submittedAt; }
}