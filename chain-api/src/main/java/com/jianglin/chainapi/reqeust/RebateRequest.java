package com.jianglin.chainapi.reqeust;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @FileName RebateRequest
 * @Author lin.jiang
 * @Date 2023/2/24 16:06
 * @Description: 抵扣金请求参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RebateRequest extends BaseRequest{
	private String rebateName;
}
