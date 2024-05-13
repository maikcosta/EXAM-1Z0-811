package tech.maikcosta.exam2;

import java.util.ArrayList;
import java.util.List;

public class ListSet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0, "Verde");
        list.set(0, "Branco");

        System.out.println(list);
    }
}
