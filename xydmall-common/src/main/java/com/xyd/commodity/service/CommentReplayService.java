package com.xyd.commodity.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyd.commodity.entity.CommentReplayEntity;
import com.xyd.utils.PageUtils;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 15:56:16
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

