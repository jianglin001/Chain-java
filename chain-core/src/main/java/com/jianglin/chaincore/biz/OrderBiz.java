package com.jianglin.chaincore.biz;

import com.jianglin.chaincore.context.OrderContexts;

/**
 * @FileName OrderBiz
 * @Author lin.jiang
 * @Date 2023/2/24 17:37
 * @Description:
 */
public interface OrderBiz {
	void submitOrder(OrderContexts orderContexts);
}
