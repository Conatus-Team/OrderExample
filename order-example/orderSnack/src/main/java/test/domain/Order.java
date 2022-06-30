package test.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import test.OrderSnackApplication;
import test.domain.OrderCanceled;
import test.domain.Ordered;

@Entity
@Table(name = "Order_table")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;

    private String foodList;

//    내가 엔티티를 만들고 repository의 save메서드를 호출할 때에 @PrePersist가 달린 메서드가 호출이 되고
//    DB에 insert된 후에 @PostPersist 메서드가 호출이 된다.
    @PrePersist
    public void onPrePersist() {
        Ordered ordered = new Ordered(this);
        ordered.setId(customerId);
        ordered.publishAfterCommit();

//        OrderCanceled orderCanceled = new OrderCanceled(this);
//        orderCanceled.publishAfterCommit();
//
//        //Following code causes dependency to external APIs
//        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.
//
//        test.external.Cancellation cancellation = new test.external.Cancellation();
//        // mappings goes here
//        OrderSnackApplication.applicationContext
//            .getBean(test.external.CancellationService.class)
//            .cancel(cancellation);
    }

    @PreRemove
    public void onPreRemove() {}

    public static OrderRepository repository() {
        OrderRepository orderRepository = OrderSnackApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }
}
