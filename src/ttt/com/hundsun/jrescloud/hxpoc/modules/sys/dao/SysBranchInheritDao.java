package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysBranchInheritEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysBranchInheritEntityExample;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysBranchInheritEntityKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysBranchInheritDao {
    long countByExample(SysBranchInheritEntityExample example);

    int deleteByExample(SysBranchInheritEntityExample example);

    int deleteByPrimaryKey(SysBranchInheritEntityKey key);

    int insert(SysBranchInheritEntity record);

    int insertSelective(SysBranchInheritEntity record);

    List<SysBranchInheritEntity> selectByExample(SysBranchInheritEntityExample example);

    SysBranchInheritEntity selectByPrimaryKey(SysBranchInheritEntityKey key);

    int updateByExampleSelective(@Param("record") SysBranchInheritEntity record, @Param("example") SysBranchInheritEntityExample example);

    int updateByExample(@Param("record") SysBranchInheritEntity record, @Param("example") SysBranchInheritEntityExample example);

    int updateByPrimaryKeySelective(SysBranchInheritEntity record);

    int updateByPrimaryKey(SysBranchInheritEntity record);
}