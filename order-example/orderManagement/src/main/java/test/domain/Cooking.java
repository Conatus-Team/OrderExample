package test.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import test.OrderManagementApplication;
import test.domain.Cooked;

@Entity
@Table(name = "Cooking_table")
@Data
public class Cooking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderId;

    @PrePersist
    public void onPrePersist() {
        Cooked cooked = new Cooked(this);
        cooked.publishAfterCommit();
    }

    public static CookingRepository repository() {
        CookingRepository cookingRepository = OrderManagementApplication.applicationContext.getBean(
            CookingRepository.class
        );
        return cookingRepository;
    }

    public static void cook(Ordered ordered) {
        /** Example 1:  new item 
        Cooking cooking = new Cooking();
        repository().save(cooking);

        */

        /** Example 2:  finding and process
        
        repository().findById(ordered.get???()).ifPresent(cooking->{
            
            cooking // do something
            repository().save(cooking);


         });
        */

    }
}
