package com.xyd.commodity.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyd.commodity.entity.AttrAttrgroupRelationEntity;
import com.xyd.utils.PageUtils;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 15:56:16
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

