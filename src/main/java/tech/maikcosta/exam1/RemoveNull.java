package tech.maikcosta.exam1;

import java.util.ArrayList;
import java.util.List;

public class RemoveNull {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list.remove(0) + ":" + list.remove(null));
    }
}
