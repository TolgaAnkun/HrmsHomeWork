package HmrsHomework.Hrms.business.concretes;

import HmrsHomework.Hrms.business.abstracts.JobSeekerService;
import HmrsHomework.Hrms.dataAccess.abstracts.JobSeekerDao;
import HmrsHomework.Hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class JobSeekerManager implements JobSeekerService {



    private JobSeekerDao jobSeekerDao;
    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao) {
        this.jobSeekerDao = jobSeekerDao;
    }


    @Override
    public List<JobSeeker> getAll() {
        return this.jobSeekerDao.findAll();
    }
}
