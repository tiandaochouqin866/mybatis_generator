package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysBranchExtInfoEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysBranchExtInfoEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysBranchExtInfoDao {
    long countByExample(SysBranchExtInfoEntityExample example);

    int deleteByExample(SysBranchExtInfoEntityExample example);

    int deleteByPrimaryKey(Long branchCode);

    int insert(SysBranchExtInfoEntity record);

    int insertSelective(SysBranchExtInfoEntity record);

    List<SysBranchExtInfoEntity> selectByExample(SysBranchExtInfoEntityExample example);

    SysBranchExtInfoEntity selectByPrimaryKey(Long branchCode);

    int updateByExampleSelective(@Param("record") SysBranchExtInfoEntity record, @Param("example") SysBranchExtInfoEntityExample example);

    int updateByExample(@Param("record") SysBranchExtInfoEntity record, @Param("example") SysBranchExtInfoEntityExample example);

    int updateByPrimaryKeySelective(SysBranchExtInfoEntity record);

    int updateByPrimaryKey(SysBranchExtInfoEntity record);
}