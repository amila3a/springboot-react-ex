package ework.tutorial.sboot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootReactEx1ApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(SpringbootReactEx1ApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("executing test");
		assertEquals(true, true);
	}

	private void assertEquals(boolean b, boolean c) {
		// TODO Auto-generated method stub
		
	}

}
