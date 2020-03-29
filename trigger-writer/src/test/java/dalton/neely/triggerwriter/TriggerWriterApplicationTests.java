package dalton.neely.triggerwriter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SuppressWarnings("ALL")
@SpringBootTest(webEnvironment = RANDOM_PORT)
class TriggerWriterApplicationTests {

  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  void contextLoads() {
  }

  @Test
  void helloWorld() {
    assertEquals("world", restTemplate.getForEntity("/hello", String.class).getBody());
  }

}
