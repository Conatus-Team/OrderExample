package test.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "FoodList_table")
@Data
public class FoodList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
