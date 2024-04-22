package marketplaceapply.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import marketplaceapply.domain.*;
import marketplaceapply.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DisplayName extends AbstractEvent {

    private Long id;
    private String qty;

    public DisplayName(Dispa aggregate) {
        super(aggregate);
    }

    public DisplayName() {
        super();
    }
}
//>>> DDD / Domain Event
