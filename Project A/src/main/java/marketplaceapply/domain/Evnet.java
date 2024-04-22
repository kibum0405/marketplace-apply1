package marketplaceapply.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import marketplaceapply.domain.*;
import marketplaceapply.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Evnet extends AbstractEvent {

    private Long id;
    private String display;

    public Evnet() {
        super();
    }
}
//>>> DDD / Domain Event
