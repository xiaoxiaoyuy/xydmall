package com.xyd.commodity.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyd.commodity.entity.ProductAttrValueEntity;
import com.xyd.utils.PageUtils;

import java.util.Map;

/**
 * spu属性值
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 15:56:16
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

