package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTerminalUsingHisEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTerminalUsingHisEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTerminalUsingHisDao {
    long countByExample(SysTerminalUsingHisEntityExample example);

    int deleteByExample(SysTerminalUsingHisEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysTerminalUsingHisEntity record);

    int insertSelective(SysTerminalUsingHisEntity record);

    List<SysTerminalUsingHisEntity> selectByExample(SysTerminalUsingHisEntityExample example);

    SysTerminalUsingHisEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysTerminalUsingHisEntity record, @Param("example") SysTerminalUsingHisEntityExample example);

    int updateByExample(@Param("record") SysTerminalUsingHisEntity record, @Param("example") SysTerminalUsingHisEntityExample example);

    int updateByPrimaryKeySelective(SysTerminalUsingHisEntity record);

    int updateByPrimaryKey(SysTerminalUsingHisEntity record);
}