package tech.maikcosta.exam2;

public class CalcTest {
    private static void calc() {
        System.out.println(10/0);
    }

    public static void main(String[] args) {
        try {
            calc();
        } finally {
            System.out.println("Passed!");
        }
    }
}
