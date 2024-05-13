package tech.maikcosta.exam1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodYears {
    public static void main(String [] args) {
        LocalDate date = LocalDate.of(2000, Month.JANUARY, 1);
        Period period = Period.parse("p-30000y");
        System.out.println(date.plus(period));
    }
}
