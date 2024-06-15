package main;

public class Student {
    //attributes
    private String studentName;
    private float milestone1;
    private float milestone2;
    private float terminalAssessment;
   
    //getter and setter methods
    //getter methods   
    public String getStudentName() {
        return studentName;
    }
   
    public String getMilestone1() {
        return String.valueOf(milestone1);
    }
   
    public String getMilestone2() {
        return String.valueOf(milestone2);
    }
   
    public String getTerminalAssessment() {
        return String.valueOf(terminalAssessment);
    }
    
    public String getTotalGrade () {
    	return String.valueOf(milestone1 + milestone2 + terminalAssessment);
    }
   
    //setter methods   
    public void setStudentName(String studName) {
        studentName = studName;
    }
   
    public void setMilestone1(float q1) {
        milestone1 = q1;
    }
   
    public void setMilestone2(float q2) {
        milestone2 = q2;
    }
   
    public void setTerminalAssessment(float q3) {
        terminalAssessment = q3;
    }
}