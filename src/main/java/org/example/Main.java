package org.example;

import org.example.task1.Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setAuthor("John Doe");
        book1.setName("Example Book 1");
        book1.setYear(1890);
        book1.display();
    }
}