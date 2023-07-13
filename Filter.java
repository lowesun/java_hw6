package lesson_6_hw_1;

import java.util.HashSet;

public class Filter {
    public static void main(String[] args) {

        HashSet<Cats> hashSet = new HashSet<>();
        hashSet.add(new Cats("Люк", 4, "male", "Мэйн-Кун"));
        hashSet.add(new Cats("Джеймс", 3, "male", "Британская"));
        hashSet.add(new Cats("Найси", 7, "female", "Британская"));
        hashSet.add(new Cats("Уильям", 7, "male", "Шотландская"));
        hashSet.add(new Cats("Дженоа", 5, "female", "Бенгальская"));
        hashSet.add(new Cats("Перри", 2, "female", "Сфинкс"));
        hashSet.add(new Cats("Космо",4, "male", "Сиамская"));
        hashSet.add(new Cats("Старки", 7, "male", "Сиамская"));
        hashSet.add(new Cats("Гром", 4, "male", "Мэйн-Кун"));
        hashSet.add(new Cats("Имир", 3, "male", "Британская"));
        hashSet.add(new Cats("Спарки", 13, "male", "Бенгальская"));


        System.out.println(hashSet);
    }
}