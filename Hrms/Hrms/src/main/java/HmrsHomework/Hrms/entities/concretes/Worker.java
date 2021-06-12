package HmrsHomework.Hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="workers")
@AllArgsConstructor
@NoArgsConstructor

public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="worker_id")
    private int id;

    @Column(name="worker_name")
    private String name;

}
