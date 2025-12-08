package SV1;

import java.util.Objects;

public final class StudentRecord extends Object {
    private String name;
    private int age;
    private String college;

    public StudentRecord(String name, int age, String college) {
        this.name = name;
        this.age = age;
        this.college = college;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StudentRecord sr) {
            return sr.age == age &&  sr.college.equals(college) && sr.name.equals(name);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 42;
    }

    static void main() {
        StudentRecord sr1 = new StudentRecord("James", 19, "Homerton");
        StudentRecord sr2 = new StudentRecord("James", 19, "Homerton");
        sr1.print();
        Person p1 = new Person("James", 19, "Homerton");
        Person p2 = new Person("James", 19, "Homerton");
        p1.print();

        System.out.println(sr1.equals(sr2));
        System.out.println(p1.equals(p2));
    }
}

record Person(String name, int age, String college) {
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", College: " + college;
    }
}