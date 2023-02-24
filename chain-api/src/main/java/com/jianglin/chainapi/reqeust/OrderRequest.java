package com.jianglin.chainapi.reqeust;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @FileName OrderRequest
 * @Author lin.jiang
 * @Date 2023/2/24 16:06
 * @Description: 订单请求参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest extends BaseRequest{
	private String orderName;
}
