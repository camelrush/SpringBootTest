package com.ksaplabo.ectest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EctestApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void ecTestControllerSum() {
		EctestController ecCon = new EctestController();
		long ret = ecCon.sum(0L, 2L, 3L);
		assertThat(ret , is(5L));
	}

}
