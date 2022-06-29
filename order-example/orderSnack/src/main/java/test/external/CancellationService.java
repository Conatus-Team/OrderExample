package test.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "orderManagement", url = "${api.url.orderManagement}")
public interface CancellationService {
    @RequestMapping(method = RequestMethod.POST, path = "/cancellations")
    public void cancel(@RequestBody Cancellation cancellation);
    // keep

}
