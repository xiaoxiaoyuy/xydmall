package com.xyd.service.impl;

import com.xyd.utils.PageUtils;
import com.xyd.utils.Query;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.xyd.dao.GrowthChangeHistoryDao;
import com.xyd.member.entity.GrowthChangeHistoryEntity;
import com.xyd.member.service.GrowthChangeHistoryService;
import org.apache.dubbo.config.annotation.Service;


@Service(accesslog = "growthChangeHistoryService")
public class GrowthChangeHistoryServiceImpl extends ServiceImpl<GrowthChangeHistoryDao, GrowthChangeHistoryEntity> implements GrowthChangeHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GrowthChangeHistoryEntity> page = this.page(
                new Query<GrowthChangeHistoryEntity>().getPage(params),
                new QueryWrapper<GrowthChangeHistoryEntity>()
        );

        return new PageUtils(page);
    }

}