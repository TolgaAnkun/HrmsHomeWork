package HmrsHomework.Hrms.entities.concretes;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="jobs")
@Data
public class Job {

    @Id
    @GeneratedValue
    @Column(name="job_id")
    private int id;

    @Column(name="job_name")
    private String jobName;

    @Column(name="job_details")
    private String jobDetails;

    @Column(name="job_price")
    private double jobPrice;

    public Job() {
    }

    public Job(int id, String jobName, String jobDetails, double jobPrice) {
        this.id = id;
        this.jobName = jobName;
        this.jobDetails = jobDetails;
        this.jobPrice = jobPrice;
    }



}
