package marketplaceapply.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import marketplaceapply.domain.*;
import marketplaceapply.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CompanyAdd extends AbstractEvent {

    private Long companyNumber;
    private String name;

    public CompanyAdd(Company aggregate) {
        super(aggregate);
    }

    public CompanyAdd() {
        super();
    }
}
//>>> DDD / Domain Event
