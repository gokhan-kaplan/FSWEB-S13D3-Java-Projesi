package com.workintech.model;

import com.workintech.model.Person;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Gökhan","Kaplan",28);
        Person person2 = new Person("Ahmet","Mehmet",30,
                20000,false, new String[]{"asd", "abc"});

        System.out.println("Salary " + person2.salary);
        System.out.println("Is Teen " + person2.isTeen());
        System.out.println("Hobbies " + Arrays.toString(person2.hobbies));

        Person john = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + john.getFirstName());
        System.out.println("LastName: " + john.getLastName());
        System.out.println("Age: " + john.getAge());

        System.out.println(john);
        System.out.println("*********");
        Wall wall = new Wall(5,4);
        System.out.println("Get width: " + wall.getWidth());
        System.out.println("Get height: " + wall.getHeight());
        System.out.println("Area: " + wall.getArea());

        wall.setWidth(-5);
        System.out.println("Get width: " + wall.getWidth());
        wall.setHeight(-4);
        System.out.println("Get height: " + wall.getHeight());


        Wall wall2 = new Wall(-5,-4);
        System.out.println("Get width: " + wall2.getWidth());
        System.out.println("Get height: " + wall2.getHeight());


    }
}