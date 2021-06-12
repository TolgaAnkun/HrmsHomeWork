package HmrsHomework.Hrms.business.abstracts;

import HmrsHomework.Hrms.entities.concretes.Job;

import java.util.List;

public interface JobService {
    List<Job> getAll();
}
