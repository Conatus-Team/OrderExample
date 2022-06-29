package test.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import test.domain.*;

@Component
public class CancellationHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Cancellation>> {

    @Override
    public EntityModel<Cancellation> process(EntityModel<Cancellation> model) {
        return model;
    }
}
