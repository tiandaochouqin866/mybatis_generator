package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysUpMchntApplyHisEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysUpMchntApplyHisEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUpMchntApplyHisDao {
    long countByExample(SysUpMchntApplyHisEntityExample example);

    int deleteByExample(SysUpMchntApplyHisEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUpMchntApplyHisEntity record);

    int insertSelective(SysUpMchntApplyHisEntity record);

    List<SysUpMchntApplyHisEntity> selectByExample(SysUpMchntApplyHisEntityExample example);

    SysUpMchntApplyHisEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUpMchntApplyHisEntity record, @Param("example") SysUpMchntApplyHisEntityExample example);

    int updateByExample(@Param("record") SysUpMchntApplyHisEntity record, @Param("example") SysUpMchntApplyHisEntityExample example);

    int updateByPrimaryKeySelective(SysUpMchntApplyHisEntity record);

    int updateByPrimaryKey(SysUpMchntApplyHisEntity record);
}