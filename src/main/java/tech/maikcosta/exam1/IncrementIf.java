package tech.maikcosta.exam1;

public class IncrementIf {
    public static void main(String[] args) {
        int i = 5;
        if(i++ < 6) {
            System.out.println(i++);
        }
    }
}
