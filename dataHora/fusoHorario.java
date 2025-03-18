package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class fusoHorario {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2022-07-20T01:30:36");
        LocalDateTime d05 = LocalDateTime.parse("");
        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);

    }


}
