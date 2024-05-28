package tech.maikcosta.exam1;

public class FlagTest {
    private static boolean flag = !true;

    public static void main(String [] args) {
        System.out.println(!flag ? args[0] : args[1]);
    }
}
