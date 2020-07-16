package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTerminalStorageEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysTerminalStorageEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTerminalStorageDao {
    long countByExample(SysTerminalStorageEntityExample example);

    int deleteByExample(SysTerminalStorageEntityExample example);

    int deleteByPrimaryKey(Long storageBatchNo);

    int insert(SysTerminalStorageEntity record);

    int insertSelective(SysTerminalStorageEntity record);

    List<SysTerminalStorageEntity> selectByExample(SysTerminalStorageEntityExample example);

    SysTerminalStorageEntity selectByPrimaryKey(Long storageBatchNo);

    int updateByExampleSelective(@Param("record") SysTerminalStorageEntity record, @Param("example") SysTerminalStorageEntityExample example);

    int updateByExample(@Param("record") SysTerminalStorageEntity record, @Param("example") SysTerminalStorageEntityExample example);

    int updateByPrimaryKeySelective(SysTerminalStorageEntity record);

    int updateByPrimaryKey(SysTerminalStorageEntity record);
}