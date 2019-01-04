package com.example.gateway.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Configuration
public class GatewayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServerApplication.class, args);
    }


    //http://www.woaini.com:10003/woaini/test
    //根据域名转到对应的服务，自己发挥
    //A,B 金丝雀发布配合分流降级功能，都可以实现。
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.host("**.woaini.com**")
                        .uri("lb://product-demo"))
                .build();
    }

    /**
     * 全局熔断器
     * @return
     */
   /* @RequestMapping(value = "/fallback")
    public Map<String, String> fallBack() {
        Map<String, String> res = new HashMap();
        res.put("code", "-100");
        res.put("data", "service not available");
        return res;
    }*/

}
