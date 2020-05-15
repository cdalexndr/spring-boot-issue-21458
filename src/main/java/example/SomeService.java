package example;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SomeService {
  @Cacheable("testcache")
  public int cacheableMethod() {
    return 1;
  }
}
