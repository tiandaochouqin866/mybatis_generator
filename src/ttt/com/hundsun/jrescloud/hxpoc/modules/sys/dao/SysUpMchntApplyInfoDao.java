package com.hundsun.jrescloud.hxpoc.modules.sys.dao;

import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysUpMchntApplyInfoEntity;
import com.hundsun.jrescloud.hxpoc.modules.sys.entity.SysUpMchntApplyInfoEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUpMchntApplyInfoDao {
    long countByExample(SysUpMchntApplyInfoEntityExample example);

    int deleteByExample(SysUpMchntApplyInfoEntityExample example);

    int deleteByPrimaryKey(Long branchCode);

    int insert(SysUpMchntApplyInfoEntity record);

    int insertSelective(SysUpMchntApplyInfoEntity record);

    List<SysUpMchntApplyInfoEntity> selectByExample(SysUpMchntApplyInfoEntityExample example);

    SysUpMchntApplyInfoEntity selectByPrimaryKey(Long branchCode);

    int updateByExampleSelective(@Param("record") SysUpMchntApplyInfoEntity record, @Param("example") SysUpMchntApplyInfoEntityExample example);

    int updateByExample(@Param("record") SysUpMchntApplyInfoEntity record, @Param("example") SysUpMchntApplyInfoEntityExample example);

    int updateByPrimaryKeySelective(SysUpMchntApplyInfoEntity record);

    int updateByPrimaryKey(SysUpMchntApplyInfoEntity record);
}