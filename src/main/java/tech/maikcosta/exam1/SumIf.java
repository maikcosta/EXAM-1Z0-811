package tech.maikcosta.exam1;

public class SumIf {
    public static void main(String[] args) {
        int val = 25;
        if(val++ < 26) {
            System.out.println(val++);
        }
    }
}
