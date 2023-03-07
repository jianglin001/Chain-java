package com.jianglin.chaincore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @FileName OrderEvenModel
 * @Author lin.jiang
 * @Date 2023/3/7 17:08
 * @Description:
 */
@Data
@AllArgsConstructor
public class OrderEvenModel {
	private Long orderNo;

	private String orderStatus;
}
