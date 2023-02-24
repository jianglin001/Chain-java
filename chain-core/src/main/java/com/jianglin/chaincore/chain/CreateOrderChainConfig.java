package com.jianglin.chaincore.chain;

import com.jianglin.chaincore.context.OrderContexts;
import com.jianglin.chaincore.handler.CouponChainHandlerBizImpl;
import com.jianglin.chaincore.handler.OrderChainHandlerBizImpl;
import com.jianglin.chaincore.handler.RebateChainHandlerBizImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @FileName CreateOrderChainConfig
 * @Author lin.jiang
 * @Date 2023/2/24 17:22
 * @Description:
 */
@Configuration
@RequiredArgsConstructor
public class CreateOrderChainConfig {
	private final CouponChainHandlerBizImpl couponChainHandlerBiz;

	private final OrderChainHandlerBizImpl orderChainHandlerBiz;

	private final RebateChainHandlerBizImpl rebateChainHandlerBiz;

	@Bean("createOrderChainPipeline")
	public HandlerPipeline<OrderContexts> createOrderChainPipeline() {
		HandlerPipeline<OrderContexts> handlerPipeline = new HandlerPipeline<>();
		handlerPipeline.addChainList(couponChainHandlerBiz);
		handlerPipeline.addChainList(orderChainHandlerBiz);
		handlerPipeline.addChainList(rebateChainHandlerBiz);
		return handlerPipeline;
	}
}
