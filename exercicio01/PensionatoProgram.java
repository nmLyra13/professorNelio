package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class PensionatoProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		RentPensionato[] rooms = new RentPensionato[10];

		System.out.print("How many rooms will be rented: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name.......: ");
			sc.nextLine(); // limpa buffer
			String name = sc.nextLine();
			System.out.print("E-mail.....: ");
			String email = sc.next();
			System.out.print("Number room (0-9): ");
			int roomNumber = sc.nextInt();

			if (rooms[roomNumber] != null) {
				System.out.println("Room already occupied! Try again.");
				i--;
			} else {
				rooms[roomNumber] = new RentPensionato(name, email);
			}

		}

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}

		}

		sc.close();

	}

}
