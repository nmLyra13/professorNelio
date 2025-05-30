package secao14.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import secao14.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Room Number: ");
		int number = sc.nextInt();
		System.out.println("Check-in date (dd/MM/yyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Check-Out date (dd/MM/yyy): ");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("Erro in reservation: Check-out date must be after check-in date");
		} else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation" + reservation);
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.err.print("check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.err.print("check-Out date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());

			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Erro in reservation: Reservation dates for update must be future");
			} else if (!checkOut.after(checkIn)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			} else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation" + reservation);
			}

		}
		sc.close();
	}

}
