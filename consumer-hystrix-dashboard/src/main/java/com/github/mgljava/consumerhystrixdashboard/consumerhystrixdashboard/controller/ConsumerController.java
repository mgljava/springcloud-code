package com.github.mgljava.consumerhystrixdashboard.consumerhystrixdashboard.controller;

import com.github.mgljava.consumerhystrixdashboard.consumerhystrixdashboard.client.HelloRemote;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ConsumerController {

  private final HelloRemote helloRemote;

  @GetMapping("/hello/{name}")
  public String index(@PathVariable("name") String name) {
    return helloRemote.hello(name);
  }
}
