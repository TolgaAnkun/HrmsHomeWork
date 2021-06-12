package HmrsHomework.Hrms.business.concretes;

import HmrsHomework.Hrms.business.abstracts.JobService;
import HmrsHomework.Hrms.dataAccess.abstracts.JobDao;
import HmrsHomework.Hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JobManager implements JobService {

    private JobDao jobDao;

    @Autowired
    public JobManager(JobDao jobDao) {
        this.jobDao = jobDao;
    }


    @Override
    public List<Job> getAll() {
        return this.jobDao.findAll();
    }
}
