package com.jianglin.chainapi.reqeust;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @FileName BaseRequest
 * @Author lin.jiang
 * @Date 2023/2/24 16:10
 * @Description: 公共请求参数
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseRequest implements Serializable {
	private Long id;

	private LocalDateTime createTime;

	private LocalDateTime updateTime;

}
