class Parent {
    int x = 5;

    public void Info() {
        System.out.println("Ini Class Parent");
    }
}

class Child extends Parent {
    int x = 10;

    public void Info() {
        System.out.println("Ini Class Child ");
    }
}

class Tes {
    public static void main(String[] args) {
        Parent tes = new Child();
        System.out.println("Nilai x = " + tes.x);
        tes.Info();
    }
}
