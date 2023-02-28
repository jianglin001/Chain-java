package com.jianglin.chaincore.biz.impl;

import com.jianglin.chainapi.reqeust.CouponRequest;
import com.jianglin.chainapi.reqeust.OrderRequest;
import com.jianglin.chainapi.reqeust.RebateRequest;
import com.jianglin.chaincore.biz.OrderBiz;
import com.jianglin.chaincore.chain.HandlerPipeline;
import com.jianglin.chaincore.context.OrderContexts;
import com.jianglin.chaincore.handler.RebateChainHandlerBizImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @FileName OrderBizImpl
 * @Author lin.jiang
 * @Date 2023/2/24 17:38
 * @Description:
 */
@Service
@RequiredArgsConstructor
public class OrderBizImpl implements OrderBiz {
	private final HandlerPipeline<OrderContexts> handlerPipeline;
	@Override
	public void submitOrder(OrderContexts orderContexts) {
		handlerPipeline.processRequest(orderContexts);
	}
}
