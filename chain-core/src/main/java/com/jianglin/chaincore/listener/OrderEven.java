package com.jianglin.chaincore.listener;

import com.jianglin.chaincore.entity.OrderEvenModel;
import lombok.Data;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * @FileName OrderEven
 * @Author lin.jiang
 * @Date 2023/3/7 17:05
 * @Description:
 */
public class OrderEven extends ApplicationEvent {

	private OrderEvenModel orderEvenModel;

	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public OrderEven(OrderEvenModel source) {
		super(source);
		this.orderEvenModel = source;
	}

	public OrderEvenModel getOrderEvenModel() {
		return orderEvenModel;
	}

	public void setOrderEvenModel(OrderEvenModel orderEvenModel) {
		this.orderEvenModel = orderEvenModel;
	}
}
