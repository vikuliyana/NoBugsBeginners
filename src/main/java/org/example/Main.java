package org.example;

import org.example.task1.book.Book;
import org.example.task1.car.Car;
import org.example.task1.clock.Clock;
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

        //Task3 - Point
        Point point1 = new Point();
        point1.setX(1);
        point1.setY(2);
        point1.moveUp();
        point1.moveDown();
        point1.moveLeft();
        point1.moveRight();

        //Task4 - Clock
        Clock clock1 = new Clock();
        clock1.setHour(23);
        clock1.setMinute(59);
        clock1.setSecond(59);
        clock1.tick();
        clock1.read();

        //Task5 - Car
        Car car1 = new Car();
        car1.setYear(1990);
        car1.setBrand("BMW");
        car1.setModel("X5");
        car1.start();
        car1.drive();
        car1.stop();
    }
}