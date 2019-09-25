package org.txlcn.demo.common.spring;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description:
 * Date: 2019/09/25
 *
 * @author lonkin
 */
@FeignClient(value = "txlcn-demo-spring-service-c", fallback = ServiceCFallback.class)
public interface ServiceCClient {

    @GetMapping("/rpc")
    String rpc(@RequestParam("value") String name);
}
