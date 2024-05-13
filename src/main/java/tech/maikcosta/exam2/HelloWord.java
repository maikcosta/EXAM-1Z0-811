package tech.maikcosta.exam2;

public class HelloWord {
    public static void main(String[] args) {
        String str = "Hello ";
        change(str);
        System.out.println(str); //Line 5
    }

    private static void change(String s) {
        s.concat("Wolrd!");
    }
}
