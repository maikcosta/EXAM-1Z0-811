package tech.maikcosta.exam1;

import java.time.LocalDate;

public class DataPlus {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("1983-06-30");
        System.out.println(date.plusMonths(8));
    }
}
