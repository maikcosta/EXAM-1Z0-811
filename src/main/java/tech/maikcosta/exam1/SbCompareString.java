package tech.maikcosta.exam1;

public class SbCompareString {
    public static void main(String[] args) {
        String str = "java";
        StringBuilder sb = new StringBuilder("java");

        System.out.println(str.equals(sb) + ":" + sb.equals(str));
    }
}
