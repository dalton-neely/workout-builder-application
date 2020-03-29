package dalton.neely.triggerwriter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerV1 implements Controller {
  @GetMapping("/hello")
  @Override
  public String helloWorld() {
    return "world";
  }
}
