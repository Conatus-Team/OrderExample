package test.infra;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import test.domain.*;

public interface FoodListRepository extends CrudRepository<FoodList, Long> {
    // keep

}
