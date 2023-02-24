package com.jianglin.chaincore.biz.impl;

import com.jianglin.chainapi.reqeust.CouponRequest;
import com.jianglin.chainapi.reqeust.OrderRequest;
import com.jianglin.chainapi.reqeust.RebateRequest;
import com.jianglin.chaincore.biz.OrderBiz;
import com.jianglin.chaincore.chain.HandlerPipeline;
import com.jianglin.chaincore.context.OrderContexts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @FileName OrderBizImpl
 * @Author lin.jiang
 * @Date 2023/2/24 17:38
 * @Description:
 */
@Service
public class OrderBizImpl implements OrderBiz {

	HandlerPipeline<OrderContexts> handlerPipeline;
	@Override
	public void submitOrder() {
		OrderContexts orderContexts = OrderContexts.builder()
				.orderRequest(new OrderRequest("Order--牛栏山"))
				.couponRequest(new CouponRequest("coupon--酒"))
				.rebateRequest(new RebateRequest("rebate--10块"))
				.build();
		handlerPipeline.processRequest(orderContexts);
	}
}
