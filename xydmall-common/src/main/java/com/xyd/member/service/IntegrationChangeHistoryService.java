package com.xyd.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyd.member.entity.IntegrationChangeHistoryEntity;
import com.xyd.utils.PageUtils;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 16:41:34
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

