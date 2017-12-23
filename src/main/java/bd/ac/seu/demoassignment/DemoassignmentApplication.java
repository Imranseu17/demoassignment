package bd.ac.seu.demoassignment;

import bd.ac.seu.demoassignment.Model.Customer;
import bd.ac.seu.demoassignment.Model.Manager;
import bd.ac.seu.demoassignment.Model.SalesPerson;
import bd.ac.seu.demoassignment.Repository.CustomerDAO;
import bd.ac.seu.demoassignment.Repository.ManagerDAO;
import bd.ac.seu.demoassignment.Repository.ProductDAO;
import bd.ac.seu.demoassignment.Repository.SalespersonDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoassignmentApplication {


	@Bean
	public CommandLineRunner demo(CustomerDAO customerDAO,
								  ManagerDAO managerDAO,
								  ProductDAO productDAO,
								  SalespersonDAO salespersonDAO) {
		return (String... args) -> {

			customerDAO.save(new Customer(1111,"Imran","159"));
			customerDAO.save(new Customer(1112,"Farhana","157"));
			customerDAO.save(new Customer(1113,"Bond","158"));

			managerDAO.save(new Manager(321,"Rakib Hassan Sabbir","123"));

			salespersonDAO.save(new SalesPerson(456,"Abul","634"));
			salespersonDAO.save(new SalesPerson(457,"Kabul","635"));
			salespersonDAO.save(new SalesPerson(458,"putul","636"));





		};


		}

	public static void main(String[] args) {
		SpringApplication.run(DemoassignmentApplication.class, args);
	}
}
