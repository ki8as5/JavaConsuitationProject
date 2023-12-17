package ru.innopolis.java.homework05;

import java.util.Arrays;
import java.util.Objects;

public class TV {
    private String Brand ;
    private double Diagonal;
    private String Color;
    private String Model;

    private int numberChannel;
    private int soundVolume;
    private boolean onTv;


    public TV(String brand) {
        Brand = brand;
    }

    public TV(String brand, double diagonal, String color, String model, int numberChannel, int soundVolume, boolean onTv) {
        Brand = brand;
        Diagonal = diagonal;
        Color = color;
        Model = model;
        this.numberChannel = numberChannel;
        this.soundVolume = soundVolume;
        this.onTv = onTv;
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

    public int getNumberChannel() {
        return numberChannel;
    }

    public void setNumberChannel(int numberChannel) {
        this.numberChannel = numberChannel;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume <= 0 || soundVolume >= 100){
            throw new RuntimeException("Веденное значение < 0 или > 100");
        }
        this.soundVolume = soundVolume;
    }

    public boolean isOnTv() {
        return onTv;
    }

    public void setOnTv(boolean onTv) {
        this.onTv = onTv;
    }

    @Override
    public String toString() {
        return "Телевизор с параметрами (" +
                "Brand='" + Brand + '\'' +
                ", Diagonal=" + Diagonal +
                ", Color='" + Color + '\'' +
                ", Model='" + Model + '\'' +
                ", numberChannel=" + numberChannel +
                ", soundVolume=" + soundVolume +
                ", onTv=" + onTv +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return Double.compare(getDiagonal(), tv.getDiagonal()) == 0 && getNumberChannel() == tv.getNumberChannel() && getSoundVolume() == tv.getSoundVolume() && isOnTv() == tv.isOnTv() && Objects.equals(getBrand(), tv.getBrand()) && Objects.equals(getColor(), tv.getColor()) && Objects.equals(getModel(), tv.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getDiagonal(), getColor(), getModel(), getNumberChannel(), getSoundVolume(), isOnTv());
    }
}
