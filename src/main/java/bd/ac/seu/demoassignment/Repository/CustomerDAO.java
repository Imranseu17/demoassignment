package bd.ac.seu.demoassignment.Repository;

import bd.ac.seu.demoassignment.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDAO extends JpaRepository<Customer,Integer> {
}
