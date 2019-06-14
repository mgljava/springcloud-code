package com.github.mgljava.hystrix.hystrix.hystrix;


import com.github.mgljava.hystrix.hystrix.client.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements HelloRemote {

  @Override
  public String hello(@RequestParam(value = "name") String name) {
    return "hello" + name + ", this message send failed!";
  }
}
