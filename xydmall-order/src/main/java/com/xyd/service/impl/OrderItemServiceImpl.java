package com.xyd.service.impl;

import com.xyd.utils.PageUtils;
import com.xyd.utils.Query;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.xyd.dao.OrderItemDao;
import com.xyd.order.entity.OrderItemEntity;
import com.xyd.order.service.OrderItemService;
import org.apache.dubbo.config.annotation.Service;

@Service(accesslog = "orderItemService")
public class OrderItemServiceImpl extends ServiceImpl<OrderItemDao, OrderItemEntity> implements OrderItemService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderItemEntity> page = this.page(
                new Query<OrderItemEntity>().getPage(params),
                new QueryWrapper<OrderItemEntity>()
        );

        return new PageUtils(page);
    }

}