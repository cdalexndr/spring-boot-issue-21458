package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest
@TestPropertySource(properties = "prop.for.diff.context=true")
@DirtiesContext
public class CacheTest2 extends AbstractTestNGSpringContextTests {

  @Autowired
  SomeService someService;

  @Test(groups = "second", dependsOnGroups = "first")
  public void second() {
    someService.cacheableMethod();
  }
}
