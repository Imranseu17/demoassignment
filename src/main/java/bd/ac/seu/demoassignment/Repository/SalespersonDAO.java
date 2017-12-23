package bd.ac.seu.demoassignment.Repository;

import bd.ac.seu.demoassignment.Model.SalesPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalespersonDAO extends JpaRepository<SalesPerson,Integer> {
}
