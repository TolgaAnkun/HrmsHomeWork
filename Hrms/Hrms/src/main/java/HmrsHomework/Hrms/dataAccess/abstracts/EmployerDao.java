package HmrsHomework.Hrms.dataAccess.abstracts;

import HmrsHomework.Hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
}
