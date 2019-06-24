package com.github.mgljava.consumerhystrixdashboard.consumerhystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@EnableHystrixDashboard
@EnableCircuitBreaker
@SpringBootApplication
public class ConsumerHystrixDashboardApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConsumerHystrixDashboardApplication.class, args);
  }

}
