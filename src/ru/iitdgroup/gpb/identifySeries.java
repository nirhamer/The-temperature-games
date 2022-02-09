package ru.iitdgroup.gpb;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class identifySeries {
    public static void main(String[] args) {
        LocalDate from = LocalDate.of(2021,5,1);
        LocalDate to = LocalDate.of(2021,5,18);
        LocalDate current = LocalDate.of(2021,5,1);

        boolean isDateInRage = ( ! (current.isBefore(from.minusDays(1)) && current.isBefore(to.plusDays(1))) );
    }
}