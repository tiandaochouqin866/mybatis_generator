package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTerminalInventoryEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTerminalInventoryEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTerminalInventoryDao {
    long countByExample(SysTerminalInventoryEntityExample example);

    int deleteByExample(SysTerminalInventoryEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysTerminalInventoryEntity record);

    int insertSelective(SysTerminalInventoryEntity record);

    List<SysTerminalInventoryEntity> selectByExample(SysTerminalInventoryEntityExample example);

    SysTerminalInventoryEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysTerminalInventoryEntity record, @Param("example") SysTerminalInventoryEntityExample example);

    int updateByExample(@Param("record") SysTerminalInventoryEntity record, @Param("example") SysTerminalInventoryEntityExample example);

    int updateByPrimaryKeySelective(SysTerminalInventoryEntity record);

    int updateByPrimaryKey(SysTerminalInventoryEntity record);
}