package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTriggerConfigEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTriggerConfigEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTriggerConfigDao {
    long countByExample(SysTriggerConfigEntityExample example);

    int deleteByExample(SysTriggerConfigEntityExample example);

    int deleteByPrimaryKey(String triggerCode);

    int insert(SysTriggerConfigEntity record);

    int insertSelective(SysTriggerConfigEntity record);

    List<SysTriggerConfigEntity> selectByExample(SysTriggerConfigEntityExample example);

    SysTriggerConfigEntity selectByPrimaryKey(String triggerCode);

    int updateByExampleSelective(@Param("record") SysTriggerConfigEntity record, @Param("example") SysTriggerConfigEntityExample example);

    int updateByExample(@Param("record") SysTriggerConfigEntity record, @Param("example") SysTriggerConfigEntityExample example);

    int updateByPrimaryKeySelective(SysTriggerConfigEntity record);

    int updateByPrimaryKey(SysTriggerConfigEntity record);
}