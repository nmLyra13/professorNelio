package exercicios;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class TimeZone2 {

	public static void main(String[] args) {

		Instant d05 = Instant.parse("2025-04-01T01:30:26Z");

		System.out.println("------------------------");
		LocalDate r1 = LocalDate.ofInstant(d05, ZoneId.systemDefault());
		System.out.println(r1);
	}
}
