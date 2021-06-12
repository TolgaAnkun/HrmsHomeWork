package HmrsHomework.Hrms.core.utilities.abstracts;

import HmrsHomework.Hrms.entities.concretes.JobSeeker;

public interface EmailVerify {
    void verifyEmail(JobSeeker jobSeeker);
    boolean isVerifiedEmail(JobSeeker jobSeeker);
}
