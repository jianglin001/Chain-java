package com.jianglin.chaincore;

import com.jianglin.chaincore.biz.OrderBiz;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChainCoreApplicationTests {

	@Autowired
	OrderBiz orderBiz;
	@Test
	void contextLoads() {
		orderBiz.submitOrder();
	}
}
