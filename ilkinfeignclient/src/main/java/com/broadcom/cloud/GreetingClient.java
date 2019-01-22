package com.broadcom.cloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("ilkin-netflix-eureka-client")
public interface GreetingClient {

    @RequestMapping("/greeting")
    String greeting();

}
