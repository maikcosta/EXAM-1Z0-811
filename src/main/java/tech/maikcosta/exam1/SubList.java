package tech.maikcosta.exam1;

import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("J");
        list.add("A");
        list.add("V");
        list.add("A");

        List<String> subList = list.subList(2, 3);
        subList.set(0, "J");
        System.out.println(list);
    }
}
