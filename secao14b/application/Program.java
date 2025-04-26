package secao14b.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import secao14.entities.Reservation;
import secao14b.exceptions.DomainException;

public class Program {

	public static void main(String[] args) throws DomainException{

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.print("Room Number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-Out date (dd/MM/yyy): ");
			Date checkOut = sdf.parse(sc.next());

			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation" + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("check-Out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation" + reservation);
		} 
		catch (ParseException e) {
			System.out.println("Invalid date format");
		} 
		//catch (DomainException e) {
			//System.out.println("Error in reservation: " + e.getMessage());
		//}
		sc.close();
	}
}
