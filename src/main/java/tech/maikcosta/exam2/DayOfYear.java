package tech.maikcosta.exam2;

import java.time.LocalDate;

public class DayOfYear {
    public static void main(String [] args) {
        LocalDate joiningDate = LocalDate.parse("2024-04-25");
        System.out.println(joiningDate.withDayOfYear(23));
    }
}
