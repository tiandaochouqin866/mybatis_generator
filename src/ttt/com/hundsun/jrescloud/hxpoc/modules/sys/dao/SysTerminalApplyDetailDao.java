package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTerminalApplyDetailEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTerminalApplyDetailEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTerminalApplyDetailDao {
    long countByExample(SysTerminalApplyDetailEntityExample example);

    int deleteByExample(SysTerminalApplyDetailEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysTerminalApplyDetailEntity record);

    int insertSelective(SysTerminalApplyDetailEntity record);

    List<SysTerminalApplyDetailEntity> selectByExample(SysTerminalApplyDetailEntityExample example);

    SysTerminalApplyDetailEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysTerminalApplyDetailEntity record, @Param("example") SysTerminalApplyDetailEntityExample example);

    int updateByExample(@Param("record") SysTerminalApplyDetailEntity record, @Param("example") SysTerminalApplyDetailEntityExample example);

    int updateByPrimaryKeySelective(SysTerminalApplyDetailEntity record);

    int updateByPrimaryKey(SysTerminalApplyDetailEntity record);
}