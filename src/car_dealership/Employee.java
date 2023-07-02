package car_dealership;

public class Employee {
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if(finance == true) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust, loanAmount);
		} else if(vehicle.getPrice() <= cust.getCashOnHand()) {
			processTransaction(cust, vehicle);
		}
	}
	
	public void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Customer has been approvaed to purchase the vehicle");
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println("Customer has purchase the vehicle " + vehicle 
				+ " for the price " + vehicle.getPrice());
	}
}
