package marketplaceapply.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import marketplaceapply.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/inventories")
@Transactional
public class InventoryController {

    @Autowired
    InventoryRepository inventoryRepository;

    @RequestMapping(
        value = "inventories/{id}/inventorycreated",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Inventory inventoryCreated(
        @PathVariable(value = "id") String id,
        @RequestBody InventoryCreatedCommand inventoryCreatedCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /inventory/inventoryCreated  called #####");
        Optional<Inventory> optionalInventory = inventoryRepository.findById(
            id
        );

        optionalInventory.orElseThrow(() -> new Exception("No Entity Found"));
        Inventory inventory = optionalInventory.get();
        inventory.inventoryCreated(inventoryCreatedCommand);

        inventoryRepository.save(inventory);
        return inventory;
    }
}
//>>> Clean Arch / Inbound Adaptor
