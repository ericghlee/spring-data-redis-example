package local.playground.redis.model;

import local.playground.redis.configuration.RedisConfig;
import local.playground.redis.repository.RedisExampleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = RedisConfig.class)
@SpringBootTest
public class JobSummaryCounterTest {

    @Autowired
    private RedisExampleRepository redisExampleRepository;

    @Test
    public void test() {
        System.out.println(redisExampleRepository);
    }

}