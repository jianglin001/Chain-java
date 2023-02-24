package com.jianglin.chaincore.chain;

/**
 * @FileName AbstractOrderHandler
 * @Author lin.jiang
 * @Date 2023/2/24 15:45
 * @Description:
 */
public abstract class AbstractOrderHandler<T> {

	/**
	 * 处理请求
	 * @param handlerChainContext
	 * @param request 请求参数
	 */
	public abstract void doHandler(HandlerChainContext handlerChainContext, T request);

	/**
	 * 处理失败订单回滚操作
	 * @param handlerChainContext
	 * @param request 请求参数
	 */
	public abstract void doRollBack(HandlerChainContext handlerChainContext, T request);
}
