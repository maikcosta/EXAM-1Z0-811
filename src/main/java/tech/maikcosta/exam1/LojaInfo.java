package tech.maikcosta.exam1;

import java.util.ArrayList;
import java.util.List;

public class LojaInfo {
    public static void main(String[] args) {
        List<String> acessorios = new ArrayList<>();
        acessorios.add("fone");
        acessorios.add("webcam");
        acessorios.add("teclado");
        acessorios.add("mouse");
        acessorios.add("mic");
        acessorios.add("teclado");

        if(acessorios.remove("teclado"))
            acessorios.remove("monitor");

        System.out.println(acessorios);
    }
}
