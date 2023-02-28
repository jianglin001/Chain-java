package com.jianglin.chaincore.handler;

import com.jianglin.chaincore.chain.AbstractOrderHandler;
import com.jianglin.chaincore.chain.HandlerChainContext;
import com.jianglin.chaincore.context.OrderContexts;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @FileName RebateChainHandlerBizImpl
 * @Author lin.jiang
 * @Date 2023/2/24 16:46
 * @Description:
 */
@Component
@RequiredArgsConstructor
public class RebateChainHandlerBizImpl extends AbstractOrderHandler<OrderContexts> {
	private static final Logger logger = LoggerFactory.getLogger(RebateChainHandlerBizImpl.class);
	@Override
	public void doHandler(HandlerChainContext handlerChainContext, OrderContexts request) {
		logger.info("处理抵扣金业务开始:[{}]", request.getRebateRequest());
		handlerChainContext.fireNextContext(request);
	}

	@Override
	public void doRollBack(HandlerChainContext handlerChainContext, OrderContexts request) {
		logger.info("处理抵扣金回滚事务开始:[{}]", request.getRebateRequest());
	}
}
