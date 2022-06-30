package test.domain;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import lombok.Data;
import test.domain.*;
import test.infra.AbstractEvent;

@Data
public class Ordered extends AbstractEvent {

    private static final AtomicLong count = new AtomicLong(0);
    private Long id;
    private String productId;
    private Integer qty;
    


    public Ordered(Order aggregate) {

        super(aggregate);

//        this.id = count.incrementAndGet();
        this.productId = aggregate.getFoodList();
        this.qty = 1;
    }

    public Ordered() {

        super();




    }
    // keep

}
