package com.xyd.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyd.member.entity.MemberCollectSpuEntity;
import com.xyd.utils.PageUtils;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 16:41:34
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

