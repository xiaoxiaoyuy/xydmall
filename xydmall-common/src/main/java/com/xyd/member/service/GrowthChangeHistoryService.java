package com.xyd.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyd.member.entity.GrowthChangeHistoryEntity;
import com.xyd.utils.PageUtils;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 16:41:34
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

