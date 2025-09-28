package dev.suo.explore.greeter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

  @GetMapping("/greet")
  public String greet(@RequestParam(defaultValue = "World") String name) {
    return "Hello " + name;
  }
}
