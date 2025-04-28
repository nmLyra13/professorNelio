package secao16b.services;

import java.time.LocalDate;

import secao16b.entities.Contract;
import secao16b.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {

		double basicQuota = contract.getTotalValue() / months;

		for (int i = 0; i <= months; i++) {
			// plus months adiciona meses
			LocalDate dueDate = contract.getDate().plusMonths(i);

			// interest=juros
			double interest = onlinePaymentService.interest(basicQuota, i);
			// fee=taxa
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);

			double quota = basicQuota + interest + fee;

			contract.getInstalments().add(new Installment(dueDate, quota));
		}
	}

}
