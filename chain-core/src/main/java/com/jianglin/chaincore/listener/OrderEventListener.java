package com.jianglin.chaincore.listener;

import com.jianglin.chaincore.entity.OrderEvenModel;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @FileName OrderEventListener
 * @Author lin.jiang
 * @Date 2023/3/7 17:04
 * @Description:
 */
@Component
public class OrderEventListener implements ApplicationListener<OrderEven> {
	@Override
	public void onApplicationEvent(OrderEven event) {
		OrderEvenModel orderEvenModel = event.getOrderEvenModel();
	}
}
