package com.xyd.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyd.member.entity.MemberReceiveAddressEntity;
import com.xyd.utils.PageUtils;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 16:41:34
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

