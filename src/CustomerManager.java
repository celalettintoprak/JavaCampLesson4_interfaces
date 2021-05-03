

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müşteri eklendi : " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		// for(Logger logger : loggers) {logger.log(customer.getFirstName());}
		
	}
	
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi : " + customer.getFirstName());

		Utils.runLoggers(loggers, customer.getLastName());
		
		// for(Logger logger : loggers) {logger.log(customer.getFirstName());}
	}
	
	/*
	 * 
	 * private Logger logger;
	
	public CustomerManager(Logger logger) {
		super();
		this.logger = logger;
	}

	public void add(Customer customer) {
		System.out.println("Müşteri eklendi : " + customer.getFirstName());
		this.logger.log(customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi : " + customer.getFirstName());
		this.logger.log(customer.getFirstName());
	}
	 */
	
}
