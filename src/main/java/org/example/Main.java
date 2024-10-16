package org.example;

import org.example.task1.book.Book;
import org.example.task1.point.Point;
import org.example.task1.student.Student;

public class Main {
    public static void main(String[] args) {
        // Task1 - Book
        Book book1 = new Book();
        book1.setAuthor("John Doe");
        book1.setName("Example Book 1");
        book1.setYear(1890);
        book1.display();

        // Task2 - Student
        Student student1 = new Student();
        student1.setStudentName("Anna Schmidt");
        student1.setBookNumber(123);
        student1.setAvgScore(4);
        student1.print();

        //Task3 - Pint
        Point point1 = new Point();
        point1.setX(1);
        point1.setY(2);
        point1.moveUp();
        point1.moveDown();
        point1.moveLeft();
        point1.moveRight();
    }
}