package model.services;

public interface OnlinePaymentsService {

	public Double paymentFee(Double amount);
	
	public Double interest(Double amount, Integer months);
	
}
