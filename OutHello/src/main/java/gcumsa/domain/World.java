package gcumsa.domain;

import gcumsa.OutHelloApplication;
import gcumsa.domain.Worded;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "World_table")
@Data
public class World {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        Worded worded = new Worded(this);
        worded.publishAfterCommit();
    }

    public static WorldRepository repository() {
        WorldRepository worldRepository = OutHelloApplication.applicationContext.getBean(
            WorldRepository.class
        );
        return worldRepository;
    }
}
