package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTerminalFaultDetailEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTerminalFaultDetailEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTerminalFaultDetailDao {
    long countByExample(SysTerminalFaultDetailEntityExample example);

    int deleteByExample(SysTerminalFaultDetailEntityExample example);

    int deleteByPrimaryKey(Long faultNo);

    int insert(SysTerminalFaultDetailEntity record);

    int insertSelective(SysTerminalFaultDetailEntity record);

    List<SysTerminalFaultDetailEntity> selectByExample(SysTerminalFaultDetailEntityExample example);

    SysTerminalFaultDetailEntity selectByPrimaryKey(Long faultNo);

    int updateByExampleSelective(@Param("record") SysTerminalFaultDetailEntity record, @Param("example") SysTerminalFaultDetailEntityExample example);

    int updateByExample(@Param("record") SysTerminalFaultDetailEntity record, @Param("example") SysTerminalFaultDetailEntityExample example);

    int updateByPrimaryKeySelective(SysTerminalFaultDetailEntity record);

    int updateByPrimaryKey(SysTerminalFaultDetailEntity record);
}