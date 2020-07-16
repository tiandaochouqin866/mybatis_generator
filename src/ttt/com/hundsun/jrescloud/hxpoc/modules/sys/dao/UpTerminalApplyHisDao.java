package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.UpTerminalApplyHisEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.UpTerminalApplyHisEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpTerminalApplyHisDao {
    long countByExample(UpTerminalApplyHisEntityExample example);

    int deleteByExample(UpTerminalApplyHisEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UpTerminalApplyHisEntity record);

    int insertSelective(UpTerminalApplyHisEntity record);

    List<UpTerminalApplyHisEntity> selectByExample(UpTerminalApplyHisEntityExample example);

    UpTerminalApplyHisEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UpTerminalApplyHisEntity record, @Param("example") UpTerminalApplyHisEntityExample example);

    int updateByExample(@Param("record") UpTerminalApplyHisEntity record, @Param("example") UpTerminalApplyHisEntityExample example);

    int updateByPrimaryKeySelective(UpTerminalApplyHisEntity record);

    int updateByPrimaryKey(UpTerminalApplyHisEntity record);
}