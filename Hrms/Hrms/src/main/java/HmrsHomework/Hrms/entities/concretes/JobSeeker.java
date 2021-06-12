package HmrsHomework.Hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="jobseekers")
@AllArgsConstructor
@NoArgsConstructor

public class JobSeeker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="seeker_id")
    private int id;

    @Column(name="seeker_name")
    private String name;

    @Column(name="seeker_last_name")
    private String lastName;

    @Column(name="seeker_birth_date")
    private String birthDate;

    @Column(name="seeker_email")
    private String email;

    @Column(name="seeker_identity_number")
    private String identityNumber;

    @Column(name="seeker_password")
    private String password;

    @Column(name="seeker_repeat_password")
    private  String repeatPassword;

}
