package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysMchntChannelInfoEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysMchntChannelInfoEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMchntChannelInfoDao {
    long countByExample(SysMchntChannelInfoEntityExample example);

    int deleteByExample(SysMchntChannelInfoEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysMchntChannelInfoEntity record);

    int insertSelective(SysMchntChannelInfoEntity record);

    List<SysMchntChannelInfoEntity> selectByExample(SysMchntChannelInfoEntityExample example);

    SysMchntChannelInfoEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysMchntChannelInfoEntity record, @Param("example") SysMchntChannelInfoEntityExample example);

    int updateByExample(@Param("record") SysMchntChannelInfoEntity record, @Param("example") SysMchntChannelInfoEntityExample example);

    int updateByPrimaryKeySelective(SysMchntChannelInfoEntity record);

    int updateByPrimaryKey(SysMchntChannelInfoEntity record);
}