package com.xyd.sale.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyd.sale.entity.SeckillPromotionEntity;
import com.xyd.utils.PageUtils;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 16:22:44
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

