package com.xyd.sale.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyd.sale.entity.MemberPriceEntity;
import com.xyd.utils.PageUtils;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 16:22:45
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

