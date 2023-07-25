package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentsService onlinePaymentsService;

	public ContractService(OnlinePaymentsService onlinePaymentsService) {
		this.onlinePaymentsService = onlinePaymentsService;
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue()/months;
		for (int i=1; i<= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest = onlinePaymentsService.interest(basicQuota, i);
			double fee = onlinePaymentsService.paymentFee(basicQuota + interest);
			
			double quota = basicQuota + interest + fee;
			
			contract.getInstallments().add(new Installment(dueDate, quota));
			
		}
		
	}
	
}