package tech.maikcosta.exam2;

public class AtribuicaoA {
    public static void main(String[] args) {
        int a = 20;
        int var = --a * a++ + a-- - --a;
        System.out.println("a = " + a);
        System.out.println("var = " + var);
    }
}
