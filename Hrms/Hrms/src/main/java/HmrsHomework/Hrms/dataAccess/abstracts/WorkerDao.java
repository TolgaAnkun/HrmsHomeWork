package HmrsHomework.Hrms.dataAccess.abstracts;

import HmrsHomework.Hrms.entities.concretes.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerDao extends JpaRepository<Worker, Integer> {
}
