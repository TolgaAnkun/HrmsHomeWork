package HmrsHomework.Hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Data
@Entity
@Table(name="employers")
@AllArgsConstructor
@NoArgsConstructor

public class Employer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employer_id")
    private int id;


    @Column(name="employer_name")
    private String companyName;

    @Column(name="employer_email")
    private String email;


    @Column(name="employer_number")
    private String phoneNumber;


    @Column(name="employer_password")
    private String password;


}
