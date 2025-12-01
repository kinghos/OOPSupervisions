package SV2;

interface NinjaInterface {
    void ninjaMethod();
}

class Employee {
    public void employeeMethod() {};
}

class Ninja {
    public void ninjaMethod() {};
}

public class NinjaEmployee extends Employee implements NinjaInterface {
    Ninja ninja = new Ninja();

    @Override
    public void ninjaMethod() {
        ninja.ninjaMethod();
    }

}
