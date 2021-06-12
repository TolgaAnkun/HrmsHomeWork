package HmrsHomework.Hrms.core.utilities.concretes;

import HmrsHomework.Hrms.core.utilities.abstracts.EmailVerify;
import HmrsHomework.Hrms.entities.concretes.JobSeeker;

public class EmailVerifyManager implements EmailVerify {


    @Override
    public void verifyEmail(JobSeeker jobSeeker) {
        System.out.println(jobSeeker.getEmail()+ " adresine gönderdiğimiz doğrulama linkine tıklayın");
    }

    @Override
    public boolean isVerifiedEmail(JobSeeker jobSeeker) {
        System.out.println(jobSeeker.getName()+" "+ jobSeeker.getLastName()+ " e-posta adresiniz doğrulanmıştır.");
        return true;
    }
}