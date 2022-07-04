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
    private Long id;

    private String orderId;


//    @PrePersist
//    // DB에 저장되기 전
//    public void onPrePersist() {
//        Cooked cooked = new Cooked(this);
//        System.out.println("cooked 이벤트 발행 ");
//        // 이벤트 발행
//        cooked.publishAfterCommit();
//    }

    @PostPersist
    public void onPostPersist() {
        Cooked cooked = new Cooked(this);
        System.out.println("cooked 이벤트 발행 ");
        // 이벤트 발행
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
        Cooking cooking = new Cooking();
        // 이벤트, DB에 둘 다 세팅
        // id는 어떻게 세팅할지: DB에서 자동생성 되는데, 그 값을 이벤트에 어떻게 넣어야 할까,,
        cooking.setOrderId(ordered.getProductId());
        System.out.println("cooking DB에 저장 ");
        repository().save(cooking);
        /** Example 2:  finding and process
        
        repository().findById(ordered.get???()).ifPresent(cooking->{
            
            cooking // do something
            repository().save(cooking);


         });
        */

    }
}
