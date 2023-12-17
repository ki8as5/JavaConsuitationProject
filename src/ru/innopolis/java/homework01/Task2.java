package ru.innopolis.java.homework01;

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        Random rand = new Random();
        int petya = rand.nextInt(0,3);
        int vasya = rand.nextInt(0,3);
        if (petya == 0) {
            if (vasya == 0) {
                System.out.println("Ничья");
            } else if (vasya == 1) {
                System.out.println("petya");
            } else if (vasya == 2) {
                System.out.println("vasya");
        } }else if (petya == 1){
            if (vasya == 0) {
                System.out.println("vasya");
            } else if (vasya == 1) {
                System.out.println("Ничья");
            } else if (vasya == 2) {
                System.out.println("petya");
            }
        } else if (petya == 2) {
            if (vasya == 0) {
                System.out.println("petya");
            } else if (vasya == 1) {
                System.out.println("vasya");
            } else if (vasya == 2) {
                System.out.println("Ничья");
            }
        }

    }
}

