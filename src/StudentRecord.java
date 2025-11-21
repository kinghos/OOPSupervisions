public final class StudentRecord {
    private String name;
    private int age;
    private String college;

    public StudentRecord(String name, int age, String college) {
        this.name = name;
        this.age = age;
        this.college = college;
    }

    public void print() {
        System.out.println("Name: " + name + ", Age: " + age + ", College: " + college);
    }
}

record Person (String name, int age, String college) {
    public void print() {
        System.out.println("Name: " + name + ", Age: " + age + ", College: " + college);
    }
}