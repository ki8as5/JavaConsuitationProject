package ru.innopolis.java.homework03;

import java.util.Scanner;

public class TV {
    private String Brand ;
    private double Diagonal;
    private String Color;
    private String Model;


    public TV() {
    }

    public TV (
            String brand,
            double Diagonal,
            String Model,
            String Color
        ){
        this.Brand = brand;
        this.Diagonal = Diagonal;
        this.Model = Model;
        this.Color = Color;
    }
    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public double getDiagonal() {
        return Diagonal;
    }

    public void setDiagonal(double diagonal) {
        Diagonal = diagonal;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    @Override
    public String toString(){
        return String.format("TV с параметрами; \n brand: %s\n Diagonal: %s\n Model: %s\n Color: %s" ,
                this.Brand,
                this.Diagonal,
                this.Model,
                this.Color);
    }


}
