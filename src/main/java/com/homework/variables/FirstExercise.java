package com.homework.variables;

import java.util.Scanner;

public class FirstExercise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = "My name is test";
        System.out.println(str);
        System.out.println(str.replace("test", sc.nextLine()));
    }

}

