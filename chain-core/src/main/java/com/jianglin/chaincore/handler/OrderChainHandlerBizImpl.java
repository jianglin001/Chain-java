package com.jianglin.chaincore.handler;

import com.jianglin.chaincore.chain.AbstractOrderHandler;
import com.jianglin.chaincore.chain.HandlerChainContext;
import com.jianglin.chaincore.context.OrderContexts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @FileName OrderChainHandlerBizImpl
 * @Author lin.jiang
 * @Date 2023/2/24 16:21
 * @Description: 订单处理业务
 */
@Service
public class OrderChainHandlerBizImpl extends AbstractOrderHandler<OrderContexts> {

	private static final Logger logger = LoggerFactory.getLogger(OrderChainHandlerBizImpl.class);

	@Override
	public void doHandler(HandlerChainContext handlerChainContext, OrderContexts request) {
		logger.info("处理订单请求开始");
	}

	@Override
	public void doRollBack(HandlerChainContext handlerChainContext, OrderContexts request) {
		logger.info("处理订单回滚请求开始");
	}
}
