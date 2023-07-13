package lesson_6_hw_1;

import java.util.Objects;

public class Cats {

    String name;
    int age;
    String gender;
    String breed;

    public Cats() {

    }

    public Cats(String name, int age, String gender, String breed){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;

    }

    @Override
    public String toString() {
        return String.format("%s: %s, %d years, %s \n", name, age, gender, breed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cats cat = (Cats) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(breed, cat.breed) && Objects.equals(gender, cat.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, breed);
    }
}