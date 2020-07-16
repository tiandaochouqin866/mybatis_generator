package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysBranchActEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysBranchActEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysBranchActDao {
    long countByExample(SysBranchActEntityExample example);

    int deleteByExample(SysBranchActEntityExample example);

    int deleteByPrimaryKey(Long branchCode);

    int insert(SysBranchActEntity record);

    int insertSelective(SysBranchActEntity record);

    List<SysBranchActEntity> selectByExample(SysBranchActEntityExample example);

    SysBranchActEntity selectByPrimaryKey(Long branchCode);

    int updateByExampleSelective(@Param("record") SysBranchActEntity record, @Param("example") SysBranchActEntityExample example);

    int updateByExample(@Param("record") SysBranchActEntity record, @Param("example") SysBranchActEntityExample example);

    int updateByPrimaryKeySelective(SysBranchActEntity record);

    int updateByPrimaryKey(SysBranchActEntity record);
}