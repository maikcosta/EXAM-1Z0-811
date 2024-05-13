package tech.maikcosta.exam1;

public class FlagHello {
    public static void main(String[] args) {
        String msg = "Hello";
        boolean [] flag = new boolean[1];
        if(flag[0]) {
            msg = "Welcome";
        }
        System.out.println(msg);
    }
}
