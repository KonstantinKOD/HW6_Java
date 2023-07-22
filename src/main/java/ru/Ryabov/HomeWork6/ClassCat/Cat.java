package ru.Ryabov.HomeWork6.ClassCat;

import java.util.Objects;

public class Cat {
    private String name, status, breed, color, gender;
    private int age, feet;
    private double weight;

    public Cat(String name, String status, String breed, String color, String gender, int age, int feet, double weight) {
        this.name = name;
        this.status = status;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
        this.age = age;
        this.feet = feet;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        if (age < 0) {
            throw new RuntimeException("У котиков 9 жизнет, это действительно так.\n Но возраст же не может быть ОТРИЦАТЕЛЬНЫМ!!!");
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFeet() {
        if (feet > 4 || feet < 1) {
            throw new RuntimeException("Кажется это внеземное существо! О_о" +
                    "\nКоличество лап не соответствует норме."
            );
        }
        if (feet < 4) {
            System.out.println("\nОчень жалко котика/кошечку :_((");
        } else {
            System.out.println("\nУ этого представителя/представительницы кошачих даже все лапы на месте!");
        }
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public double getWeight() {
        if (weight > 20)
            System.out.println("У вашего питомца наблюдается излишний вес");
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Если можно поясните пожалуйста для чего предназначен метод ниже :)
     * Так и не смог с его помощью вывести в консоль параметры обьекта.
     */
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", feet=" + feet +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && feet == cat.feet && Double.compare(cat.weight, weight) == 0 && Objects.equals(name, cat.name) && Objects.equals(status, cat.status) && Objects.equals(breed, cat.breed) && Objects.equals(color, cat.color) && Objects.equals(gender, cat.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, breed, color, gender, age, feet, weight);
    }
}

