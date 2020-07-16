package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.UpTerminalApplyInfoEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.UpTerminalApplyInfoEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpTerminalApplyInfoDao {
    long countByExample(UpTerminalApplyInfoEntityExample example);

    int deleteByExample(UpTerminalApplyInfoEntityExample example);

    int insert(UpTerminalApplyInfoEntity record);

    int insertSelective(UpTerminalApplyInfoEntity record);

    List<UpTerminalApplyInfoEntity> selectByExample(UpTerminalApplyInfoEntityExample example);

    int updateByExampleSelective(@Param("record") UpTerminalApplyInfoEntity record, @Param("example") UpTerminalApplyInfoEntityExample example);

    int updateByExample(@Param("record") UpTerminalApplyInfoEntity record, @Param("example") UpTerminalApplyInfoEntityExample example);
}