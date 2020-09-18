package com.xyd.warehouse.service.impl;

import com.xyd.utils.PageUtils;
import com.xyd.utils.Query;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.xyd.warehouse.dao.PurchaseDetailDao;
import com.xyd.warehouse.entity.PurchaseDetailEntity;
import com.xyd.warehouse.service.PurchaseDetailService;
import org.apache.dubbo.config.annotation.Service;


@Service(accesslog = "purchaseDetailService")
public class PurchaseDetailServiceImpl extends ServiceImpl<PurchaseDetailDao, PurchaseDetailEntity> implements PurchaseDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PurchaseDetailEntity> page = this.page(
                new Query<PurchaseDetailEntity>().getPage(params),
                new QueryWrapper<PurchaseDetailEntity>()
        );

        return new PageUtils(page);
    }

}