package YouTubeDemo;

public class Program {

	public void Main() {
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Save();

		Customer customer = new Customer(); // örneği oluşturmak , instance oluşturmak,instance creation

		customer.setId(1);
		customer.setFirstName("Gökhan");
		customer.setLastName("Yıldırım");
		customer.setCity("İstanbul");

		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();

		CustomerManager customerManager2 = new CustomerManager(new Person());
		Person person = new Person();
		person.setFirstName("Engin");
		person.setNationalIdentity("06");
		person.setId(34);

		Customer c1 = new Customer();
		Customer c2 = new Company();
		Customer c3 = new Person();

	}
}