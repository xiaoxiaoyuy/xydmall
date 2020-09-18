package com.xyd.sale.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyd.sale.entity.SkuLadderEntity;
import com.xyd.utils.PageUtils;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 16:22:44
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

