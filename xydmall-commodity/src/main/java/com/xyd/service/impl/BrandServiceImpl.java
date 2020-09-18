package com.xyd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyd.dao.BrandDao;

import com.xyd.utils.PageUtils;
import com.xyd.utils.Query;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import com.xyd.commodity.entity.BrandEntity;
import com.xyd.commodity.service.BrandService;
import org.apache.dubbo.config.annotation.Service;


@Service(accesslog = "brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                new QueryWrapper<BrandEntity>()
        );

        return new PageUtils(page);
    }

}