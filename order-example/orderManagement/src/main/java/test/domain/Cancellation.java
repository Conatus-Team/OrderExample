package test.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import test.OrderManagementApplication;
import test.domain.CookingCanceled;

@Entity
@Table(name = "Cancellation_table")
@Data
public class Cancellation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderId;

    @PrePersist
    public void onPrePersist() {
        CookingCanceled cookingCanceled = new CookingCanceled(this);
        cookingCanceled.publishAfterCommit();
    }

    public static CancellationRepository repository() {
        CancellationRepository cancellationRepository = OrderManagementApplication.applicationContext.getBean(
            CancellationRepository.class
        );
        return cancellationRepository;
    }
}
