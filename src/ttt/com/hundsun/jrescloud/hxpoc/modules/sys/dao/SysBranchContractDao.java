package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysBranchContractEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysBranchContractEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysBranchContractDao {
    long countByExample(SysBranchContractEntityExample example);

    int deleteByExample(SysBranchContractEntityExample example);

    int deleteByPrimaryKey(Long branchCode);

    int insert(SysBranchContractEntity record);

    int insertSelective(SysBranchContractEntity record);

    List<SysBranchContractEntity> selectByExample(SysBranchContractEntityExample example);

    SysBranchContractEntity selectByPrimaryKey(Long branchCode);

    int updateByExampleSelective(@Param("record") SysBranchContractEntity record, @Param("example") SysBranchContractEntityExample example);

    int updateByExample(@Param("record") SysBranchContractEntity record, @Param("example") SysBranchContractEntityExample example);

    int updateByPrimaryKeySelective(SysBranchContractEntity record);

    int updateByPrimaryKey(SysBranchContractEntity record);
}