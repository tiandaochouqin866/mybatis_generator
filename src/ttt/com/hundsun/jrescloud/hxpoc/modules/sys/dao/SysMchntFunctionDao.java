package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysMchntFunctionEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysMchntFunctionEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMchntFunctionDao {
    long countByExample(SysMchntFunctionEntityExample example);

    int deleteByExample(SysMchntFunctionEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysMchntFunctionEntity record);

    int insertSelective(SysMchntFunctionEntity record);

    List<SysMchntFunctionEntity> selectByExample(SysMchntFunctionEntityExample example);

    SysMchntFunctionEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysMchntFunctionEntity record, @Param("example") SysMchntFunctionEntityExample example);

    int updateByExample(@Param("record") SysMchntFunctionEntity record, @Param("example") SysMchntFunctionEntityExample example);

    int updateByPrimaryKeySelective(SysMchntFunctionEntity record);

    int updateByPrimaryKey(SysMchntFunctionEntity record);
}