package marketplaceapply.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import marketplaceapply.domain.*;
import marketplaceapply.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InventoryCreated extends AbstractEvent {

    private String name;
    private String qty;
    private String stock;

    public InventoryCreated(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryCreated() {
        super();
    }
}
//>>> DDD / Domain Event
