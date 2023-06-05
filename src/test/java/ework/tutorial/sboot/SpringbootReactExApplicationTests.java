package ework.tutorial.sboot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootReactExApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(SpringbootReactExApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("executing test");
//		assertEquals(true, true);
	}



}
