package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysChannelFeeEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysChannelFeeEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysChannelFeeDao {
    long countByExample(SysChannelFeeEntityExample example);

    int deleteByExample(SysChannelFeeEntityExample example);

    int deleteByPrimaryKey(Long channelFeeCode);

    int insert(SysChannelFeeEntity record);

    int insertSelective(SysChannelFeeEntity record);

    List<SysChannelFeeEntity> selectByExample(SysChannelFeeEntityExample example);

    SysChannelFeeEntity selectByPrimaryKey(Long channelFeeCode);

    int updateByExampleSelective(@Param("record") SysChannelFeeEntity record, @Param("example") SysChannelFeeEntityExample example);

    int updateByExample(@Param("record") SysChannelFeeEntity record, @Param("example") SysChannelFeeEntityExample example);

    int updateByPrimaryKeySelective(SysChannelFeeEntity record);

    int updateByPrimaryKey(SysChannelFeeEntity record);
}