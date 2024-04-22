package marketplaceapply.infra;

import marketplaceapply.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class DispaHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Dispa>> {

    @Override
    public EntityModel<Dispa> process(EntityModel<Dispa> model) {
        return model;
    }
}
