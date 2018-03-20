package hello.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/")
class IndexController {
  @Value("${HELLO_SECRET}")
  private String secret;

  @GetMapping
  ResponseEntity<String> getIndex() {
      return ResponseEntity.ok().body("My secret is " + secret);
  }
}