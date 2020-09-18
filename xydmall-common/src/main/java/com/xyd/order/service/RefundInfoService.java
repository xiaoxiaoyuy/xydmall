package com.xyd.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyd.order.entity.RefundInfoEntity;
import com.xyd.utils.PageUtils;

import java.util.Map;

/**
 * 退款信息
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 12:01:09
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

