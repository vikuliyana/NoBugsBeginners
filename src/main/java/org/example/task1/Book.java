package org.example.task1;

public class Book implements Displayable{
    private String name;
    private String author;
    private int year;

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String name) {
        this.author = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}
