package tech.maikcosta.exam2;

public class Stack {
    public static void main(String[] args) {
        String stack = new String(new char[] {'J', 'a', 'v', 'a'});
        switch (stack) {
            default:
                System.out.println("Qualquer Stack!");
            case "Angular":
                System.out.println("Angular");
            case "Java":
                System.out.println("JAVA");
            case "Python":
                System.out.println("PYTHON");
                break;
        }
    }
}
