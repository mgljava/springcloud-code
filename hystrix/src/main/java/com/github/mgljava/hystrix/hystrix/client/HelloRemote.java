package com.github.mgljava.hystrix.hystrix.client;

import com.github.mgljava.hystrix.hystrix.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

  @RequestMapping(value = "/hello")
  String hello(@RequestParam(value = "name") String name);
}
