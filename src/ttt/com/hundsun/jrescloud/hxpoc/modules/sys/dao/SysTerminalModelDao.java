package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTerminalModelEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTerminalModelEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTerminalModelDao {
    long countByExample(SysTerminalModelEntityExample example);

    int deleteByExample(SysTerminalModelEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysTerminalModelEntity record);

    int insertSelective(SysTerminalModelEntity record);

    List<SysTerminalModelEntity> selectByExample(SysTerminalModelEntityExample example);

    SysTerminalModelEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysTerminalModelEntity record, @Param("example") SysTerminalModelEntityExample example);

    int updateByExample(@Param("record") SysTerminalModelEntity record, @Param("example") SysTerminalModelEntityExample example);

    int updateByPrimaryKeySelective(SysTerminalModelEntity record);

    int updateByPrimaryKey(SysTerminalModelEntity record);
}