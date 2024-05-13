package tech.maikcosta.exam1;

class Primary {
    static void print() {
        System.out.println("Primary");
    }
}

class Second extends Primary {
    static void print() {
        System.out.println("Second");
    }
}

public class TestExtends {
    public static void main(String[] args) {
        Primary primary = null;
        Second second = (Second) primary;
        second.print();
    }
}