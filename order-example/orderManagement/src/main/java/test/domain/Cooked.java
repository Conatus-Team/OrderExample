package test.domain;

import java.util.Date;
import lombok.Data;
import test.domain.*;
import test.infra.AbstractEvent;

@Data
public class Cooked extends AbstractEvent {

    private Long id;
    private String orderId;


    public Cooked(Cooking aggregate) {
        super(aggregate);
    }

    public Cooked() {
        super();
    }
    // keep

}
