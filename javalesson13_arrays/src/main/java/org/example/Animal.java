package org.example;

public class Animal {


    private String species;
    private String kingdom;
    private int age;
    private String name;
    private double price;
    private boolean available;


    public Animal() {

    }

    public Animal(String species, String kingdom, int age, String name, double price, boolean available) {
        this.species = toProperCased(species);
        this.kingdom = toProperCased(kingdom);
        this.age = age;
        this.name = toProperCased(name);
        this.price = price;
        this.available = available;
    }



    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    private String toProperCased(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }

    public String intro() {
        return String.format("-----Intro-----%n" +
                "Species: %s%n" +
                "Kingdom: %s%n" +
                "Age: %d%n" +
                "Name: %s%n" +
                "Price: $%.2f%n" +
                "Available?:  " + (available ? "yes" : "no"), this.species, this.kingdom, this.age, this.name, this.price, this.isAvailable());

    }
}
