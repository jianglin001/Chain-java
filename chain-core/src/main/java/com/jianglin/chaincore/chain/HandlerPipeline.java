package com.jianglin.chaincore.chain;

import com.jianglin.chaincore.context.OrderContexts;

import java.util.Objects;

/**
* @FileName HandlerPipeline
* @Author lin.jiang
* @Date 2023/2/24 17:25
* @Description: 处理接口转发
*/
public class HandlerPipeline<T> {
	HandlerChainContext handlerChainContext;

	public HandlerPipeline() {
		handlerChainContext = new HandlerChainContext<>(new AbstractOrderHandler() {
			@Override
			public void doHandler(HandlerChainContext chainContext, Object request) {
				handlerChainContext.fireNextContext(request);
			}

			@Override
			public void doRollBack(HandlerChainContext chainContext, Object request) {
				handlerChainContext.firePervContext(request);
			}
		});
	}

	// 处理开始
	public void processRequest(T t) {
		handlerChainContext.handlerWork(t);
	}

	public void addChainLast(AbstractOrderHandler handler) {
		HandlerChainContext chainContext = handlerChainContext;
		while (Objects.nonNull(chainContext.next)) {
			chainContext = chainContext.next;
		}
		HandlerChainContext newChainContext = new HandlerChainContext(handler);
		chainContext = newChainContext.next;
		newChainContext.perv = chainContext;
	}
}
