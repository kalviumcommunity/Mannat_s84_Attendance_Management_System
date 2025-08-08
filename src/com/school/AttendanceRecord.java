package com.school;

public class AttendanceRecord {
    private int studentId;
    private int courseID;
    private String status;

    public AttendanceRecord(int studentID, int courseID, String status){
        this.studentId= studentID;
        this.courseID= courseID;

        if("Present".equalsIgnoreCase(status) || "Absent".equalsIgnoreCase(status)){
            this.status= status;
        }
        else{
            this.status= "Invalid";
            System.out.println("Warning: Invalid attendance status provided. Set to 'Invalid'.");
        }
    }

    public void displayRecord(){
        System.out.println("Attendance: Student ID " + studentId + " in Course ID C" + courseID + " - Status: " + status);
    }
    
}
