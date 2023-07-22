package ru.Ryabov.HomeWork6.ClassCat;

import java.util.HashSet;

public class Program {

    public static void task() {
        HashSet<Cat> cats = new HashSet<>();
        Cat cat1 = new Cat("Барсик", "Домашний", "Сиамский", "Бежевый", "Мальчик", 2, 3, 48.0);
        Cat cat2 = new Cat("Плюшка", "Домашняя", "Русская голубая", "Серебристо-голубая", "Девочка", 5, 1, 4.0);
        Cat cat3 = new Cat("Фланец", "Домашний", "Абиссинская кошка", "Жесткая и блестящая", "Мальчик", 4, 4, 3.6);
        Cat cat4 = new Cat("Плюшка", "Домашняя", "Русская голубая", "Серебристо-голубая", "Девочка", 5, 4, 4.0);

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);

        for (Cat cat : cats) {
            System.out.println(
                    "Имя Котика/Кошечки: " + cat.getName() +
                    "\nСтатус: " + cat.getStatus() +
                    "\nПорода: " + cat.getBreed() +
                    "\nЦвет: " + cat.getColor() +
                    "\nПол: " + cat.getGender() +
                    "\nВозраст: " + cat.getAge() +
                    "\nКоличество лап: " + cat.getFeet() +
                    "\nВес: " + cat.getWeight()
            );
        }
    }

    public static void main(String[] args) {
        task();
    }
}
