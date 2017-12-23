package bd.ac.seu.demoassignment.Repository;

import bd.ac.seu.demoassignment.Model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerDAO extends JpaRepository<Manager,Integer> {
}
