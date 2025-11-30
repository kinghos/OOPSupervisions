package SV2;

class Student {
    int ticks;
    public boolean pass() {
        return ticks == 20;
    }
}

class NSStudent extends Student {
    @Override
    public boolean pass() {
        return ticks >= 10;
    }
}
