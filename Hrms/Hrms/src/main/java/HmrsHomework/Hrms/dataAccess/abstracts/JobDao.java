package HmrsHomework.Hrms.dataAccess.abstracts;

import HmrsHomework.Hrms.entities.concretes.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDao extends JpaRepository<Job,Integer> {

}
