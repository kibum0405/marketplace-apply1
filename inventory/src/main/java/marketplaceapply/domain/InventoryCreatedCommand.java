package marketplaceapply.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class InventoryCreatedCommand {

    private String name;
    private String qty;
}
