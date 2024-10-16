package org.example.task1.student;

public class Student implements Printable{
    private String studentName;
    private int bookNumber;
    private int avgScore ;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public void setAvgScore(int avgScore) {
        this.avgScore = avgScore;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public int getAvgScore() {
        return avgScore;
    }

    @Override
    public void print() {
        System.out.println("Student's name: " + studentName);
        System.out.println("Book number: " + bookNumber);
        System.out.println("Average score: " + avgScore);
    }
}
