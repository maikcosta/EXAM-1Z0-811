package tech.maikcosta.exam1;

public class StrSbEquals {
    public static void main(String[] args) {
        String str = "java";
        StringBuilder sb = new StringBuilder("java");
        System.out.println(str.equals(sb) + ":" + sb.equals(str));
    }
}
