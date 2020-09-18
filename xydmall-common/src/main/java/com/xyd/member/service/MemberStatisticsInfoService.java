package com.xyd.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyd.member.entity.MemberStatisticsInfoEntity;
import com.xyd.utils.PageUtils;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 16:41:34
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

