package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTerminalApplyEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTerminalApplyEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTerminalApplyDao {
    long countByExample(SysTerminalApplyEntityExample example);

    int deleteByExample(SysTerminalApplyEntityExample example);

    int deleteByPrimaryKey(Long applyBatchNo);

    int insert(SysTerminalApplyEntity record);

    int insertSelective(SysTerminalApplyEntity record);

    List<SysTerminalApplyEntity> selectByExample(SysTerminalApplyEntityExample example);

    SysTerminalApplyEntity selectByPrimaryKey(Long applyBatchNo);

    int updateByExampleSelective(@Param("record") SysTerminalApplyEntity record, @Param("example") SysTerminalApplyEntityExample example);

    int updateByExample(@Param("record") SysTerminalApplyEntity record, @Param("example") SysTerminalApplyEntityExample example);

    int updateByPrimaryKeySelective(SysTerminalApplyEntity record);

    int updateByPrimaryKey(SysTerminalApplyEntity record);
}