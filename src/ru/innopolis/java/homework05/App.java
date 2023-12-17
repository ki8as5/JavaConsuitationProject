package ru.innopolis.java.homework05;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        TV[] mas = new TV[2];
        for (int i = 0;i < 2;i++){
            System.out.println("Введите бренд телевизора");
            String brand = scr.next();
            System.out.println("Введите диагональ");
            double diagonal = scr.nextDouble();
            System.out.println("Введите цвет");
            String color = scr.next();
            System.out.println("Введите модель");
            String model = scr.next();
            System.out.println("Введите номер каннала");
            int numberChannel = scr.nextInt();
            System.out.println("Введите громкость звука от 0 до 100");
            int soundVolume = scr.nextInt();
            System.out.println("Введите работает ли телевизор: да или нет");
            String onTvStr = scr.nextLine();
            boolean onTv = scr.next().equals("да");
            TV tv = new TV(brand,diagonal,color,model,numberChannel,soundVolume,onTv);
            mas[i] = tv;
        }
        System.out.println("Введите максимальное число громкости от 50 до 70 ");
        int maxVolume = scr.nextInt();
      for(int i = 0; i < mas.length; i ++){
          if(mas[i].isOnTv() && mas[i].getSoundVolume() <= maxVolume){
              System.out.println(mas[i]);
           }
        }
    }
}
