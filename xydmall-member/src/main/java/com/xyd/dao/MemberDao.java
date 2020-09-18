package com.xyd.dao;

import com.xyd.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 16:41:34
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
