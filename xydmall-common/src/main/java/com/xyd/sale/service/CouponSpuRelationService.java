package com.xyd.sale.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyd.sale.entity.CouponSpuRelationEntity;
import com.xyd.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 16:22:45
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

