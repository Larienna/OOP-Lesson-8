package Task5;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private boolean tail;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    //строковое представление
    @Override
    public String toString() {
        return "Cat: name = " + name + ", age = " + age + ", tail = " + (tail ? "yes" : "no");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal))return false;
        Animal animal = (Animal) obj;
        return age == animal.age &&
                tail == animal.tail &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }

    public static void main(String[] args) {
        Animal cat = new Animal("Basya", 5, true);
        System.out.println(cat.toString());
        Animal cat1 = new Animal("Vasya", 45, false);
        System.out.println(cat1);
        System.out.println("Equals: "+cat.equals(cat1));
        System.out.println("HashCodes of cats are: "+ (cat.hashCode() == cat1.hashCode()));
    }
}
