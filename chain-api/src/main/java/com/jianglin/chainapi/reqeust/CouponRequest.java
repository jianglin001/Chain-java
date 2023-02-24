package com.jianglin.chainapi.reqeust;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @FileName CouponRequest
 * @Author lin.jiang
 * @Date 2023/2/24 16:09
 * @Description: 赠品请求参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CouponRequest extends BaseRequest{
	private String couponName;
}
