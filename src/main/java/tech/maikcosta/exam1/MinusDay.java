package tech.maikcosta.exam1;

import java.time.LocalDate;

public class MinusDay {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("2024-06-06");
        date.minusDays(10);
        System.out.println(date);
    }
}
