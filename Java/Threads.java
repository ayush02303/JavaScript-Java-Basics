class A extends Thread {
    public void run() {
        System.out.println("Hello there !");
    }
}

class B extends Thread {
    public void run() {
        System.out.println("Hello there in B !");
    }
}

class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}
