package com.jianglin.chaincore.chain;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * @FileName HandlerChainContext
 * @Author lin.jiang
 * @Date 2023/2/24 15:48
 * @Description: 处理器上下文信息
 */
@Slf4j
public class HandlerChainContext<T> {

	// 下个处理
	HandlerChainContext<T> next;

	// 上一个处理
	HandlerChainContext<T> perv;

	AbstractOrderHandler<T> handler;

	public HandlerChainContext(AbstractOrderHandler handler) {
		this.handler = handler;
	}

	public void handlerWork(T t) { this.handler.doHandler(this, t);}

	private void rollBackWork(T t) {
		this.handler.doRollBack(this, t);
	}

	public void firePervContext(T t) {
		if (Objects.nonNull(this.perv)) {
			this.perv.rollBackWork(t);
		}
	}

	public void fireNextContext(T t) {
		if (Objects.nonNull(this.next)) {
			this.next.handlerWork(t);
		}
	}
}
