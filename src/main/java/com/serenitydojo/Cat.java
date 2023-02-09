package com.serenitydojo;

public class Cat extends Pet {
//    Moved to Pet Class
//    private String name;
    private String favoriteToy;

//    Moved to Pet Class
//    private int age;

    public Cat(String name, String favoriteToy, int age) {
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

    public String play(){
        return "plays with string";
    }
}
