package com.serenitydojo;

public class Dog extends Pet{
    //moved to Pet Class
    //private String name;

    private String favoriteToy;

    //moved to Pet Class
    //private int age;

    private boolean isFed = false;

    public static final String DOG_NOISE = "Woof";

    public Dog(String name, String favoriteToy, int age) {
        super(name, age);
//        this.name = name;
        this.favoriteToy = favoriteToy;
//        this.age = age;
    }

//    Moved to Pet Class
//    public String getName() {
//        return name;
//    }

//    Moved to Pet Class
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

//    Moved to Pet Class
//    public int getAge() {
//        return age;
//    }

//    Moved to Pet Class
//    public void setAge(int age) {
//        this.age = age;
//    }

    public boolean isFed() {
        return isFed;
    }

    // Exercise 4
    public String makeNoise() {return DOG_NOISE;}

    public void feed() {
        this.isFed = true;
    }

    public String play(){
        return "plays with bone";
    }
}
