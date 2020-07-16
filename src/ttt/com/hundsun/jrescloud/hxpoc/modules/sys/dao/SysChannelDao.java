package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysChannelEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysChannelEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysChannelDao {
    long countByExample(SysChannelEntityExample example);

    int deleteByExample(SysChannelEntityExample example);

    int deleteByPrimaryKey(Long channelNo);

    int insert(SysChannelEntity record);

    int insertSelective(SysChannelEntity record);

    List<SysChannelEntity> selectByExample(SysChannelEntityExample example);

    SysChannelEntity selectByPrimaryKey(Long channelNo);

    int updateByExampleSelective(@Param("record") SysChannelEntity record, @Param("example") SysChannelEntityExample example);

    int updateByExample(@Param("record") SysChannelEntity record, @Param("example") SysChannelEntityExample example);

    int updateByPrimaryKeySelective(SysChannelEntity record);

    int updateByPrimaryKey(SysChannelEntity record);
}