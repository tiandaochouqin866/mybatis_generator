package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTerminalFaultApplyEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTerminalFaultApplyEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTerminalFaultApplyDao {
    long countByExample(SysTerminalFaultApplyEntityExample example);

    int deleteByExample(SysTerminalFaultApplyEntityExample example);

    int deleteByPrimaryKey(Long applyNo);

    int insert(SysTerminalFaultApplyEntity record);

    int insertSelective(SysTerminalFaultApplyEntity record);

    List<SysTerminalFaultApplyEntity> selectByExample(SysTerminalFaultApplyEntityExample example);

    SysTerminalFaultApplyEntity selectByPrimaryKey(Long applyNo);

    int updateByExampleSelective(@Param("record") SysTerminalFaultApplyEntity record, @Param("example") SysTerminalFaultApplyEntityExample example);

    int updateByExample(@Param("record") SysTerminalFaultApplyEntity record, @Param("example") SysTerminalFaultApplyEntityExample example);

    int updateByPrimaryKeySelective(SysTerminalFaultApplyEntity record);

    int updateByPrimaryKey(SysTerminalFaultApplyEntity record);
}