class A {
    int i;
    public A (int i) {
        i = this.i;
    }
}

class B extends A {
    public B(int i) {
        super(i);
    }
}

class C extends B {
    public C(int i) {
        super(i);
    }
}