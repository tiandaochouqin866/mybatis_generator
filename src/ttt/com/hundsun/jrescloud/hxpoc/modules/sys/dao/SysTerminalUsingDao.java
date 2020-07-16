package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTerminalUsingEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTerminalUsingEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTerminalUsingDao {
    long countByExample(SysTerminalUsingEntityExample example);

    int deleteByExample(SysTerminalUsingEntityExample example);

    int deleteByPrimaryKey(Long terminalCode);

    int insert(SysTerminalUsingEntity record);

    int insertSelective(SysTerminalUsingEntity record);

    List<SysTerminalUsingEntity> selectByExample(SysTerminalUsingEntityExample example);

    SysTerminalUsingEntity selectByPrimaryKey(Long terminalCode);

    int updateByExampleSelective(@Param("record") SysTerminalUsingEntity record, @Param("example") SysTerminalUsingEntityExample example);

    int updateByExample(@Param("record") SysTerminalUsingEntity record, @Param("example") SysTerminalUsingEntityExample example);

    int updateByPrimaryKeySelective(SysTerminalUsingEntity record);

    int updateByPrimaryKey(SysTerminalUsingEntity record);
}