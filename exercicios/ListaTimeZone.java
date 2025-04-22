package exercicios;

import java.time.ZoneId;

public class ListaTimeZone {

	public static void main(String[] args) {

		for (String x : ZoneId.getAvailableZoneIds()) {
			System.out.println(x);
		}
	}

}
