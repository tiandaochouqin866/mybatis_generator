package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysSceneTerminalRelEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysSceneTerminalRelEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSceneTerminalRelDao {
    long countByExample(SysSceneTerminalRelEntityExample example);

    int deleteByExample(SysSceneTerminalRelEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysSceneTerminalRelEntity record);

    int insertSelective(SysSceneTerminalRelEntity record);

    List<SysSceneTerminalRelEntity> selectByExample(SysSceneTerminalRelEntityExample example);

    SysSceneTerminalRelEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysSceneTerminalRelEntity record, @Param("example") SysSceneTerminalRelEntityExample example);

    int updateByExample(@Param("record") SysSceneTerminalRelEntity record, @Param("example") SysSceneTerminalRelEntityExample example);

    int updateByPrimaryKeySelective(SysSceneTerminalRelEntity record);

    int updateByPrimaryKey(SysSceneTerminalRelEntity record);
}