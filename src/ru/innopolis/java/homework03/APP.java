package ru.innopolis.java.homework03;

import java.util.Scanner;

public class APP {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        TV sony = new TV();
        sony.setBrand("sony");
        sony.setDiagonal(56.6);
        sony.setColor("red");
        sony.setModel("adqwewqd");;
        TV samsung = new TV(scr.next(), scr.nextDouble(), scr.next(), scr.next());
        System.out.println(sony);
        System.out.println(samsung);





    }
}
