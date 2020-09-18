package com.xyd.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyd.order.entity.OrderEntity;
import com.xyd.utils.PageUtils;

import java.util.Map;

/**
 * 订单
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 12:01:09
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

