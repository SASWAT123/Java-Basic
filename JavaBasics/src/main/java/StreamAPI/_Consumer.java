package StreamAPI;

import java.util.function.Consumer;

public class _Consumer {

	public static void main(String[] args) {

		// Consumer example
		greetCustomer.accept(new Customer("Saswat", 2606684));

	}

	static Consumer<Customer> greetCustomer = customer -> System.out
			.println("Hey " + customer.customerName + " , your Id is : " + customer.cutomerId);

	static class Customer {
		private String customerName;
		private Integer cutomerId;

		public Customer(String customerName, Integer cutomerId) {
			this.customerName = customerName;
			this.cutomerId = cutomerId;
		}

	}

}
