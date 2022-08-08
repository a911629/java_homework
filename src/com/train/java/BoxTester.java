package com.train.java;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box3 box3 = new Box3();
        Box5 box5 = new Box5();
        int length, width, height;

        System.out.print("Please enter object's length: ");
        length = scanner.nextInt();

        System.out.print("Please enter object's width: ");
        width = scanner.nextInt();

        System.out.print("Please enter object's height: ");
        height = scanner.nextInt();

        if (box3.validate(length, width, height))
            System.out.print("Box3 ");
        if (box5.validate(length, width, height))
            System.out.print("Box5");
    }
}
