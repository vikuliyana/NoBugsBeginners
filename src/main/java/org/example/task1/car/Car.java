package org.example.task1.car;

public class Car implements Drivable{
    private String brand;
    private String model;
    private int year;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return this.brand;
    }
    public int getYear(){
        return this.year;
    }
    public String getModel(){
        return this.model;
    }

    @Override
    public void start() {
        System.out.println("The car is started");
    }

    @Override
    public void stop() {
        System.out.println("The car is stopped");
    }

    @Override
    public void drive() {
        System.out.println("The car is driving");
    }

}
