package com.workintech.model;

public class Person {
    String firstName;
    String lastName;
    int age;
    double salary;
    boolean isMarried;
    String[] hobbies;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age,
                  double salary, boolean isMarried, String[] hobbies){
        this(firstName, lastName, age);
        if(salary < 11500){
            this.salary = 11500;
        }else {
            this.salary = salary;
        }
        this.salary = salary;
        this.isMarried = isMarried;
        this.hobbies = hobbies;

    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return age >=13 && age <=19;
    }

    @Override
    public String toString() {
        return "Kişi Bilgileri={" +
                "İsim='" + firstName + '\'' +
                ", Soyisim='" + lastName + '\'' +
                ", Yaş=" + age +
                '}';
    }
}
