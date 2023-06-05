package ework.tutorial.sboot;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootReactExApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(SpringbootReactExApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("executing test");
		assertEquals(true, true);
	}



}
