package com.example.demo.business.demo2.service;



import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDemo2Application.class, args);
    }


    //@Bean
    //@LoadBalanced
    //public RestTemplate getRestTemplate() {
     //   return new RestTemplate();
    //}



    /**
     * 加载自定义负载均衡器
     * @return
     */
    //@Bean
    //public IRule getLoadBalancedRule() {
     //   return  new RandomRule();

    //}
}
