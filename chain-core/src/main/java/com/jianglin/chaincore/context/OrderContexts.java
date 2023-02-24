package com.jianglin.chaincore.context;

import com.jianglin.chainapi.reqeust.CouponRequest;
import com.jianglin.chainapi.reqeust.OrderRequest;
import com.jianglin.chainapi.reqeust.RebateRequest;
import lombok.Builder;
import lombok.Data;

/**
 * @FileName OrderContexts
 * @Author lin.jiang
 * @Date 2023/2/24 16:01
 * @Description:
 */
@Data
@Builder
public class OrderContexts {

	private CouponRequest couponRequest;

	private OrderRequest orderRequest;

	private RebateRequest rebateRequest;
}
