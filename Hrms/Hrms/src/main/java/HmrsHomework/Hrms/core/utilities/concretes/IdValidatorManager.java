package HmrsHomework.Hrms.core.utilities.concretes;

import HmrsHomework.Hrms.core.utilities.abstracts.IdValidator;
import HmrsHomework.Hrms.entities.concretes.JobSeeker;

public class IdValidatorManager implements IdValidator {

    @Override
    public boolean IsIdValididentityNumber(JobSeeker jobSeeker) {
        if(jobSeeker.getIdentityNumber().length()== 11){
            return true;
        }else {
            return  false;
        }
    }
}
