package HmrsHomework.Hrms.dataAccess.abstracts;

import HmrsHomework.Hrms.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {

}
