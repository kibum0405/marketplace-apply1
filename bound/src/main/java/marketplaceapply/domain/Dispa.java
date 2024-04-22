package marketplaceapply.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import marketplaceapply.BoundApplication;
import marketplaceapply.domain.DisplayName;

@Entity
@Table(name = "Dispa_table")
@Data
//<<< DDD / Aggregate Root
public class Dispa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String displayName;

    private String test;

    @PostPersist
    public void onPostPersist() {
        DisplayName displayName = new DisplayName(this);
        displayName.publishAfterCommit();
    }

    public static DispaRepository repository() {
        DispaRepository dispaRepository = BoundApplication.applicationContext.getBean(
            DispaRepository.class
        );
        return dispaRepository;
    }
}
//>>> DDD / Aggregate Root
