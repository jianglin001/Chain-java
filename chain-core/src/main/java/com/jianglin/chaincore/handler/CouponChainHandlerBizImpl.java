package com.jianglin.chaincore.handler;

import com.jianglin.chaincore.chain.AbstractOrderHandler;
import com.jianglin.chaincore.chain.HandlerChainContext;
import com.jianglin.chaincore.context.OrderContexts;
import com.jianglin.chaincore.entity.OrderEvenModel;
import com.jianglin.chaincore.listener.OrderEven;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @FileName CouponChainHandlerBizImpl
 * @Author lin.jiang
 * @Date 2023/2/24 16:41
 * @Description: 处理赠品业务
 */
@Component
@RequiredArgsConstructor
public class CouponChainHandlerBizImpl extends AbstractOrderHandler<OrderContexts> {

	private static final Logger logger = LoggerFactory.getLogger(CouponChainHandlerBizImpl.class);

	private final ApplicationContext applicationContext;

	@Override
	public void doHandler(HandlerChainContext handlerChainContext, OrderContexts request) {
		logger.info("处理赠品业务开始, 请求参数:[{}]", request.getCouponRequest());
		applicationContext.publishEvent(new OrderEven(new OrderEvenModel(request.getCouponRequest().getId(), request.getCouponRequest().getCouponName())));
		handlerChainContext.fireNextContext(request);
	}

	@Override
	public void doRollBack(HandlerChainContext handlerChainContext, OrderContexts request) {
		logger.info("处理赠品回滚事务开始, 请求参数:[{}]", request.getCouponRequest());
	}
}
