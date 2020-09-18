package com.xyd.commodity.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyd.commodity.entity.AttrGroupEntity;
import com.xyd.utils.PageUtils;

import java.util.Map;

/**
 * 属性分组
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 15:56:16
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

