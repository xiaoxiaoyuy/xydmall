package com.xyd.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xyd.order.entity.OrderReturnReasonEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 12:01:09
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
