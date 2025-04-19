package exercicio01;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ExecTimeZone {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2025-04-02");
		LocalDateTime d05 = LocalDateTime.parse("2025-04-01T19:34:00");
		Instant d06 = Instant.parse("2025-04-01T01:30:00Z");

		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);

		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minute = " + d05.getMinute());

		// System.out.println("d04 = " +
		// d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		// System.out.println();

	}

}
