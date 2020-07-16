package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysBranchEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysBranchEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysBranchDao {
    long countByExample(SysBranchEntityExample example);

    int deleteByExample(SysBranchEntityExample example);

    int deleteByPrimaryKey(Long branchCode);

    int insert(SysBranchEntity record);

    int insertSelective(SysBranchEntity record);

    List<SysBranchEntity> selectByExample(SysBranchEntityExample example);

    SysBranchEntity selectByPrimaryKey(Long branchCode);

    int updateByExampleSelective(@Param("record") SysBranchEntity record, @Param("example") SysBranchEntityExample example);

    int updateByExample(@Param("record") SysBranchEntity record, @Param("example") SysBranchEntityExample example);

    int updateByPrimaryKeySelective(SysBranchEntity record);

    int updateByPrimaryKey(SysBranchEntity record);
}