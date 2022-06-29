package test.domain;

import java.util.Date;
import lombok.Data;
import test.domain.*;
import test.infra.AbstractEvent;

@Data
public class CookingCanceled extends AbstractEvent {

    private Long id;
    private String orderId;

    // keep

}
