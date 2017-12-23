package bd.ac.seu.demoassignment.Repository;

import bd.ac.seu.demoassignment.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDAO extends JpaRepository<Product,Integer> {
}
