package untitled.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "결제", url = "${api.url.결제}")
public interface 결제Service {
    @RequestMapping(method = RequestMethod.POST, path = "/결제")
    public void 결제(@RequestBody 결제 결제);
}
