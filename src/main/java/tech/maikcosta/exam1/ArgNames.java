package tech.maikcosta.exam1;

class Message {
    static void main(String [] args) {
        System.out.println("Welcome " + args[2] + "!");
    }
}

public class ArgNames {
    public static void main(String [] args) {
        Message.main(args);
    }
}
