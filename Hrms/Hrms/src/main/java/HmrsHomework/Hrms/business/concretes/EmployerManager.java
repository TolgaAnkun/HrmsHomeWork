package HmrsHomework.Hrms.business.concretes;

import HmrsHomework.Hrms.business.abstracts.EmployerService;
import HmrsHomework.Hrms.dataAccess.abstracts.EmployerDao;
import HmrsHomework.Hrms.entities.concretes.Employer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployerManager  implements EmployerService {



    private EmployerDao employerDao;

    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }


    @Override
    public List<Employer> getAll() {
        return this.employerDao.findAll();
    }
}
