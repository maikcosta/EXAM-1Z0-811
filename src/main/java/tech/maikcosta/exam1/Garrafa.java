package tech.maikcosta.exam1;

public class Garrafa {
    private String marca;
    private boolean vazia;
    public static void main(String[] args) {
        Garrafa g = new Garrafa();
        System.out.print("[Vazia = " + g.vazia);
        System.out.print(", Marca = " + g.marca + "]");
    }
}
