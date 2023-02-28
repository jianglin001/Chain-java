package com.jianglin.chaincore.controller;

import com.jianglin.chainapi.reqeust.CouponRequest;
import com.jianglin.chainapi.reqeust.OrderRequest;
import com.jianglin.chainapi.reqeust.RebateRequest;
import com.jianglin.chaincore.biz.OrderBiz;
import com.jianglin.chaincore.context.OrderContexts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @FileName OrderController
 * @Author lin.jiang
 * @Date 2023/2/28 15:21
 * @Description:
 */
@RequestMapping("/order")
@RestController
public class OrderController {

	@Autowired
	OrderBiz orderBiz;
	@PostMapping("/submit")
	public void submitOrder() {
		OrderContexts orderContexts = OrderContexts.builder()
				.orderRequest(new OrderRequest("Order--牛栏山"))
				.couponRequest(new CouponRequest("coupon--酒"))
				.rebateRequest(new RebateRequest("rebate--10块"))
				.build();
		orderBiz.submitOrder(orderContexts);
	}
}
