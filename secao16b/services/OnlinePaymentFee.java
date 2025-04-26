package secao16b.services;

public interface OnlinePaymentFee {

	double paymentFee(double amount);
	double interest(double amount, int months);
}
