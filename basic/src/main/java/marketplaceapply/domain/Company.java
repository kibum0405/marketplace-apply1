package marketplaceapply.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import marketplaceapply.BasicApplication;

@Entity
@Table(name = "Company_table")
@Data
//<<< DDD / Aggregate Root
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long companyNumber;

    private String name;

    private String companyName;

    @PostPersist
    public void onPostPersist() {}

    public static CompanyRepository repository() {
        CompanyRepository companyRepository = BasicApplication.applicationContext.getBean(
            CompanyRepository.class
        );
        return companyRepository;
    }

    public void CompanyCreated() {
        //
    }

    //<<< Clean Arch / Port Method
    public void companyCreated1(CompanyCreated1Command companyCreated1Command) {
        //implement business logic here:

        CompanyAdd companyAdd = new CompanyAdd(this);
        companyAdd.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
