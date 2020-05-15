package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest
public class CacheTest1 extends AbstractTestNGSpringContextTests {

  @Autowired
  SomeService someService;


  @Test(groups = "first")
  public void first() {
    someService.cacheableMethod();
  }

  @Test(groups = "third", dependsOnGroups = "second")
  public void third() {
    someService.cacheableMethod();
  }
}
