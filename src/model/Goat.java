package model;

public class Goat {
    private String name;
    private String breed;
    private int age;

    public Goat() {
        super();
    }

    public Goat(String name, String breed, int age) {
        super();
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String speak() {
        return "Mehh";
    }
}